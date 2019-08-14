// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;


import com.wechat_study.demo.model.ArticleModel;
import com.wechat_study.demo.model.VideoModel;

import java.util.List;

/**
 * @ClassName CarouselService
 * @Description 轮播服务
 * @Author caijia.rao
 * @Date 2019/8/13 18:10
 * @ModifyDate 2019/8/13 18:10
 * @Version 1.0
 */
public interface CarouselService {
    List<ArticleModel> getArticleList();


    List<VideoModel> getVideoList();



}
