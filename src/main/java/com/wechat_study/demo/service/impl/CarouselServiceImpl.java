// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.CarouselResEntity;
import com.wechat_study.demo.model.ArticleModel;
import com.wechat_study.demo.model.VideoModel;
import com.wechat_study.demo.service.CarouselService;
import com.wechat_study.demo.util.DbUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    private final int ARTICLE_TYPE = 2;
    private final int VIDEO_TYPE = 1;

    @Override
    public List<ArticleModel> getArticleList() {
        List<CarouselResEntity> list = DbUtil.getCarouselRes(ARTICLE_TYPE);
        List<ArticleModel> rsList = null;
        if (list.size() != 0) {
            rsList = new ArrayList<>();
            for (CarouselResEntity carouselResEntity : list) {
                rsList.add(new ArticleModel(carouselResEntity.getUrl(), carouselResEntity.getLabel()));
            }
        }
        return rsList;
    }

    @Override
    public List<VideoModel> getVideoList() {
        List<CarouselResEntity> list = DbUtil.getCarouselRes(VIDEO_TYPE);
        List<VideoModel> rsList = null;
        if (list.size() != 0) {
            rsList = new ArrayList<>();
            for (CarouselResEntity carouselResEntity : list) {
                String url = carouselResEntity.getUrl();
                String imgurl = carouselResEntity.getImgurl();
                rsList.add(new VideoModel(url, imgurl));
            }
        }
        return rsList;
    }


}
