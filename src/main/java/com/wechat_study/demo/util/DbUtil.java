// Copyright 2016-2101 Pica.
package com.wechat_study.demo.util;

import com.wechat_study.demo.entity.CarouselResEntity;
import com.wechat_study.demo.entity.CarouselResEntityExample;
import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.entity.UserEntityExample;
import com.wechat_study.demo.mapping.CarouselResEntityMapper;
import com.wechat_study.demo.mapping.UserEntityMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DbUtil
 * @Description 数据库工具
 * @Author caijia.rao
 * @Date 2019/8/14 11:25
 * @ModifyDate 2019/8/14 11:25
 * @Version 1.0
 */
public class DbUtil {

    /**
     * @Description 根据openid向数据库查询user
     * @Author caijia.rao
     * @Date 2019/8/13 17:24
     * @ModifyDate 2019/8/13 17:24
     * @Params [openid]
     * @Return com.wechat_study.demo.entity.UserEntity
     */
    public static UserEntity getUser(String openid) {
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
    public static void insertUser(UserEntity userEntity) {
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

    public static List<CarouselResEntity> getCarouselRes(int type) {
        SqlSession sqlSession = null;
        List<CarouselResEntity> list = new ArrayList<>();
        try {
            sqlSession = SessionUtil.getSqlSession();
            CarouselResEntityMapper carouselResEntityMapper = sqlSession.getMapper(CarouselResEntityMapper.class);
            CarouselResEntityExample example = new CarouselResEntityExample();
            CarouselResEntityExample.Criteria criteria = example.createCriteria();
            criteria.andTypeEqualTo(type);
            list = carouselResEntityMapper.selectByExample(example);
        } catch (IOException e) {
            System.out.println("get carousel error!");
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return list;
    }

}
