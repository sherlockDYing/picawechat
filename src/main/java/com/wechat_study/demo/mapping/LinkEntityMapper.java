package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.LinkEntity;
import com.wechat_study.demo.entity.LinkEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LinkEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int countByExample(LinkEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int deleteByExample(LinkEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int deleteByPrimaryKey(String linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int insert(LinkEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int insertSelective(LinkEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    List<LinkEntity> selectByExample(LinkEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    LinkEntity selectByPrimaryKey(String linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") LinkEntity record, @Param("example") LinkEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByExample(@Param("record") LinkEntity record, @Param("example") LinkEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByPrimaryKeySelective(LinkEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    int updateByPrimaryKey(LinkEntity record);
}