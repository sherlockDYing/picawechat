// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import com.wechat_study.demo.entity.*;
import com.wechat_study.demo.mapping.BankInfoEntityMapper;
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
    @Autowired
    BankInfoEntityMapper bankInfoEntityMapper;
    TestRecordEntityExample testRecordEntityExample;


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

    public int setGrade(String openid,int bankId, int score,int total){
        testRecordEntityExample = new TestRecordEntityExample();
        //查询用户是否存在
        if(!check(bankId)){
            return -2;
        }
        if(!exits(openid)){
            return -1;
        }

            TestRecordEntity testRecordEntity = new TestRecordEntity();
            testRecordEntity.setOpenid(openid);
            testRecordEntity.setBankid(bankId);
            testRecordEntity.setScore(score);
            testRecordEntity.setTotal(total);
           if( testRecordEntityMapper.insertSelective(testRecordEntity) != 0){
               return 1;
           } else {
            return 0;
        }
    }


    private boolean exits(String openid){
        return ( userEntityMapper.selectByPrimaryKey(openid) != null );
    }

    private boolean check(int bankId){return bankInfoEntityMapper.selectByPrimaryKey(bankId)!=null;}
}