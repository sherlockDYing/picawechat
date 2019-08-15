// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;


import com.wechat_study.demo.entity.ArticleResEntity;
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
    List<ArticleResEntity> getArticleList();
    List<VideoResEntity> getVideoList();
}
