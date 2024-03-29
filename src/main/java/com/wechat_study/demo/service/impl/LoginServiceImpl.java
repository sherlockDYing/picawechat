// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.mapping.UserEntityMapper;
import com.wechat_study.demo.service.LoginService;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
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
    private final String APP_SECRET = "5b222b1a2dc22b12d1c8f3443fb1cae4";
    private final String APP_ID = "wx532d861b9298c91b";
    private final String PRE_URL = "https://api.weixin.qq.com/sns/jscode2session?";

    @Autowired
    UserEntityMapper userEntityMapper;

    @Override
    public Map<String, String> getOpenid(String code) {
        JSONObject js = JSON.parseObject(code);
        String js_code = js.getString("code");
        String params = "appid=" + APP_ID + "&secret=" + APP_SECRET + "&js_code="
                + js_code + "&grant_type=authorization_code";
        String url = PRE_URL + params;
        String rs = httpRequest(url);
        JSONObject object = JSONObject.parseObject(rs);
        Map<String, String> map = new HashMap<>();
        String openid = object.getString("openid");
        if (openid != null) {
            if (userEntityMapper.selectByPrimaryKey(openid) == null) {
                userEntityMapper.insert(new UserEntity(openid, null, 0));
            }
        }
        map.put("openid", openid);
        return map;
    }


    @Override
    public Map<String, Integer> selectIdentity(String openid, int identity) {

        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(openid);
        Map<String, Integer> map = new HashMap<>();
        if (identity == 0) {
            map.put("identity", userEntity.getIdentity());
        } else {
            UserEntity userNew = new UserEntity(openid, null, identity);
            userEntityMapper.updateByPrimaryKey(userNew);
            map.put("identity", identity);
        }
        return map;
    }

    /**
     * @Description 向微信小程序服务器通过临时凭证获取用户openid
     * @Author caijia.rao
     * @Date 2019/8/13 17:25
     * @ModifyDate 2019/8/13 17:25
     * @Params [requestUrl, requestMethod, outputStr]
     * @Return java.lang.String
     */
    public String httpRequest(String url) {
        String result = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httpPost = new HttpPost(url);
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(org.apache.http.HttpResponse httpResponse) throws IOException {
                    int status = httpResponse.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = httpResponse.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException(
                                "Unexpected response status: " + status);
                    }
                }
            };
            result = httpclient.execute(httpPost, responseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
