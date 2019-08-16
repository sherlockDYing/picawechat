// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import com.wechat_study.demo.entity.VideoResEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CarouselService
 * @Description 轮播服务
 * @Author caijia.rao
 * @Date 2019/8/13 18:10
 * @ModifyDate 2019/8/13 18:10
 * @Version 1.0
 */
@Service
public interface CarouselService {

    /**
     * @Description 获取轮播视频列表
     * @Author caijia.rao
     * @Date 2019/8/16 15:59
     * @ModifyDate 2019/8/16 15:59
     * @Params []
     * @Return java.util.List<com.wechat_study.demo.entity.VideoResEntity>
     */
    List<VideoResEntity> getVideoList();
}
