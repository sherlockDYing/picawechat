package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.UserEntity;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insertSelective(UserEntity record);

}