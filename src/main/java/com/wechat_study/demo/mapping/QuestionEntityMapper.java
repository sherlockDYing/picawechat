package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.QuestionEntity;
import com.wechat_study.demo.entity.QuestionEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface QuestionEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int countByExample(QuestionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int deleteByExample(QuestionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int deleteByPrimaryKey(Integer questionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int insert(QuestionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int insertSelective(QuestionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    List<QuestionEntity> selectByExample(QuestionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    QuestionEntity selectByPrimaryKey(Integer questionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") QuestionEntity record, @Param("example") QuestionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByExample(@Param("record") QuestionEntity record, @Param("example") QuestionEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByPrimaryKeySelective(QuestionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questions
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByPrimaryKey(QuestionEntity record);
}