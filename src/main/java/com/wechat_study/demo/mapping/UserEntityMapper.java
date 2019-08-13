package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.entity.UserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int countByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int deleteByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Aug 13 09:21:19 CST 2019
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);
}