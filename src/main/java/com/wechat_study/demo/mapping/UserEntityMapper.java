package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.UserEntity;
import com.wechat_study.demo.entity.UserEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int countByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int deleteByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int deleteByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    UserEntity selectByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_records
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    int updateByPrimaryKey(UserEntity record);
}