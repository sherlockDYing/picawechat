package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.TestRecordEntity;
import com.wechat_study.demo.entity.TestRecordEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestRecordEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int countByExample(TestRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int deleteByExample(TestRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int insert(TestRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int insertSelective(TestRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    List<TestRecordEntity> selectByExample(TestRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    TestRecordEntity selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") TestRecordEntity record, @Param("example") TestRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int updateByExample(@Param("record") TestRecordEntity record, @Param("example") TestRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int updateByPrimaryKeySelective(TestRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_records
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    int updateByPrimaryKey(TestRecordEntity record);
}