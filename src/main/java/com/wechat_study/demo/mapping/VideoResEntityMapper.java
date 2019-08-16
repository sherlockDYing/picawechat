package com.wechat_study.demo.mapping;

import com.wechat_study.demo.entity.VideoResEntity;
import com.wechat_study.demo.entity.VideoResEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface VideoResEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int countByExample(VideoResEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int deleteByExample(VideoResEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int insert(VideoResEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int insertSelective(VideoResEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    List<VideoResEntity> selectByExample(VideoResEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    VideoResEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") VideoResEntity record, @Param("example") VideoResEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int updateByExample(@Param("record") VideoResEntity record, @Param("example") VideoResEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int updateByPrimaryKeySelective(VideoResEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_resources
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    int updateByPrimaryKey(VideoResEntity record);
}