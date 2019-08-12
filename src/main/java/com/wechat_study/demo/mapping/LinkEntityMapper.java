package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.LinkEntity;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkEntityMapper {



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int deleteByPrimaryKey(String linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insert(LinkEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int insertSelective(LinkEntity record);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    LinkEntity selectByPrimaryKey(String linkId);




    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int updateByPrimaryKeySelective(LinkEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table links
     *
     * @mbggenerated Mon Aug 12 18:21:59 CST 2019
     */
    int updateByPrimaryKey(LinkEntity record);
}