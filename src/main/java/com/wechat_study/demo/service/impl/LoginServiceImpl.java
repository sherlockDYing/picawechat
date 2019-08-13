// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.entity.UserEntityExample;
import com.wechat_study.demo.mapping.UserEntityMapper;
import com.wechat_study.demo.service.LoginService;
import com.wechat_study.demo.util.MyX509TrustManager;
import com.wechat_study.demo.util.SessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.*;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/13 9:51
 * @ModifyDate 2019/8/13 9:51
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    private final String APP_SECRET = "";
    private final String APP_ID = "";
    private final String PRE_URL = "https://api.weixin.qq.com/sns/jscode2session";

    /**
     * @Description 根据临时凭证获取openid并判断是否已有该用户，如果没有则新建数据库该用户
     * @Author caijia.rao
     * @Date 2019/8/13 17:54
     * @ModifyDate 2019/8/13 17:54
     * @Params [code]
     * @Return java.util.Map<java.lang.String, java.lang.String>
     */
    @Override
    public Map<String, String> getOpenid(String code) {
        String params = "appid=" + APP_ID + "&secret=" + APP_SECRET + "&js_code=" + code + "&grant_type=authorization_code";
        String url = PRE_URL + params;
        String rs = httpRequest(url, "GET", null);
        JSONObject object = JSONObject.parseObject(rs);
        String openid = object.getString("openid");
        UserEntity userEntity = getUser(openid);
        if (userEntity == null) {
            UserEntity userNew = new UserEntity(openid, openid, 0);
            insertUser(userNew);
        }
        Map<String, String> map = new HashMap<>();
        map.put("openid", openid);
        return map;
    }

    /**
     * @Description 根据openid查找用户，identity为0为查询，不为0为设置
     * @Author caijia.rao
     * @Date 2019/8/13 17:56
     * @ModifyDate 2019/8/13 17:56
     * @Params [openid, identity]
     * @Return java.util.Map<java.lang.String, java.lang.Integer>
     */
    @Override
    public Map<String, Integer> selectIdentity(String openid, int identity)  {
        UserEntity userEntity = getUser(openid);
        Map<String, Integer> map = new HashMap<>();
        if (identity == 0) {
            map.put("identity", userEntity.getIdentity());
        } else {
            UserEntity userNew = new UserEntity(openid, openid, identity);
            insertUser(userNew);
            map.put("identity", identity);
        }
        return map;
    }

    /**
     * @Description 根据openid向数据库查询user
     * @Author caijia.rao
     * @Date 2019/8/13 17:24
     * @ModifyDate 2019/8/13 17:24
     * @Params [openid]
     * @Return com.wechat_study.demo.entity.UserEntity
     */
    private UserEntity getUser(String openid) {
        SqlSession sqlSession = null;
        UserEntity user = null;
        try {
            sqlSession = SessionUtil.getSqlSession();
            UserEntityMapper userEntityMapper = sqlSession.getMapper(UserEntityMapper.class);
            UserEntityExample example = new UserEntityExample();
            UserEntityExample.Criteria criteria = example.createCriteria();
            criteria.andOpenidEqualTo(openid);
            user = userEntityMapper.selectByPrimaryKey(openid);
        } catch (IOException e) {
            System.out.println("get user error!");
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return user;
    }

    /**
     * @Description 向数据库插入user
     * @Author caijia.rao
     * @Date 2019/8/13 17:24
     * @ModifyDate 2019/8/13 17:24
     * @Params [userEntity]
     * @Return void
     */
    private void insertUser(UserEntity userEntity) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SessionUtil.getSqlSession();
            UserEntityMapper userEntityMapper = sqlSession.getMapper(UserEntityMapper.class);
            userEntityMapper.insert(userEntity);
        } catch (IOException e) {
            System.out.println("insert error!");
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * @Description 向微信小程序服务器通过临时凭证获取用户openid
     * @Author caijia.rao
     * @Date 2019/8/13 17:25
     * @ModifyDate 2019/8/13 17:25
     * @Params [requestUrl, requestMethod, outputStr]
     * @Return java.lang.String
     */
    private static String httpRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            //创建SSLContext
            SSLContext sslContext = SSLContext.getInstance("SSL");
            TrustManager[] tm = {new MyX509TrustManager()};
            //初始化
            sslContext.init(null, tm, new java.security.SecureRandom());
            //获取SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(requestMethod);
            //设置当前实例使用的SSLSocketFactory
            conn.setSSLSocketFactory(ssf);
            conn.connect();
            //往服务器端写内容
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
            }

            //读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
