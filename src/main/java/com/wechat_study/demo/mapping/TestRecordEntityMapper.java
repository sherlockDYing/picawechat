package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.TestRecordEntity;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestRecordEntityMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int deleteByPrimaryKey(String recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insert(TestRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insertSelective(TestRecordEntity record);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    TestRecordEntity selectByPrimaryKey(String recordId);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int updateByPrimaryKeySelective(TestRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int updateByPrimaryKey(TestRecordEntity record);
}