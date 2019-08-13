// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import com.wechat_study.demo.entity.TestRecordEntity;
import com.wechat_study.demo.entity.TestRecordEntityExample;
import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.entity.UserEntityExample;
import com.wechat_study.demo.mapping.TestRecordEntityMapper;
import com.wechat_study.demo.mapping.UserEntityMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GradeService
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/13 10:53
 * @ModifyDate 2019/8/13 10:53
 * @Version 1.0
 */

@Service
public class GradeService {
    @Autowired
    TestRecordEntityMapper testRecordEntityMapper;
    @Autowired
    UserEntityMapper userEntityMapper;

    TestRecordEntityExample testRecordEntityExample;

    UserEntityExample userEntityExample;

    public List<TestRecordEntity> queryGrade(String openId) {
        testRecordEntityExample = new TestRecordEntityExample();
        TestRecordEntityExample.Criteria criteria = testRecordEntityExample.createCriteria();
        criteria.andOpenidEqualTo(openId);
        List<TestRecordEntity> testRecordEntities = testRecordEntityMapper.selectByExample(testRecordEntityExample);
        if (testRecordEntities != null) {
            return testRecordEntities;
        } else {
            return new ArrayList<>();
        }
    }

    public void setGrade(String openid,int bankId, int score){
        testRecordEntityExample = new TestRecordEntityExample();
        //查询用户是否存在
        if(exits(openid)) {
            TestRecordEntity testRecordEntity = new TestRecordEntity();
            testRecordEntity.setOpenid(openid);
            testRecordEntity.setBankid(bankId);
            testRecordEntity.setScore(score);
            testRecordEntityMapper.insertSelective(testRecordEntity);
        }
    }


    public boolean exits(String openid){
        UserEntityExample.Criteria criteria = userEntityExample.createCriteria();
        if( userEntityMapper.selectByPrimaryKey(openid) == null ){
            return false;
        }else {
            return true;
        }
    }
}