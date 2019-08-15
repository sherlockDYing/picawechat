// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.entity.ArticleResEntityExample;
import com.wechat_study.demo.entity.VideoResEntity;
import com.wechat_study.demo.entity.VideoResEntityExample;
import com.wechat_study.demo.mapping.ArticleResEntityMapper;
import com.wechat_study.demo.mapping.VideoResEntityMapper;
import com.wechat_study.demo.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CarouselServiceImpl
 * @Description 轮播服务
 * @Author caijia.rao
 * @Date 2019/8/14 11:23
 * @ModifyDate 2019/8/14 11:23
 * @Version 1.0
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    ArticleResEntityMapper articleResEntityMapper;
    ArticleResEntityExample articleResEntityExample;
    @Autowired
    VideoResEntityMapper videoResEntityMapper;
    VideoResEntityExample videoResEntityExample;

    @Override
    public List<ArticleResEntity> getArticleList() {
        articleResEntityExample = new ArticleResEntityExample();
        ArticleResEntityExample.Criteria criteria = articleResEntityExample.createCriteria();
        criteria.andUrlIsNotNull();
        List<ArticleResEntity> list = articleResEntityMapper.selectByExample(articleResEntityExample);
        return list;
    }

    @Override
    public List<VideoResEntity> getVideoList() {
        videoResEntityExample = new VideoResEntityExample();
        VideoResEntityExample.Criteria criteria = videoResEntityExample.createCriteria();
        criteria.andUrlIsNotNull();
        List<VideoResEntity> list = videoResEntityMapper.selectByExample(videoResEntityExample);
        return list;
    }
}
