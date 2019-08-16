// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.entity.VideoResEntity;
import com.wechat_study.demo.response.ApiResponse;
import com.wechat_study.demo.service.CarouselService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CarouselController
 * @Description 轮播
 * @Author caijia.rao
 * @Date 2019/8/7 18:44
 * @ModifyDate 2019/8/7 18:44
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;

    @GetMapping(value = "/video")
    @ApiOperation(value = "获取轮播视频")
    public ApiResponse<?> getCarouselVideo() {
        Map<String, List<VideoResEntity>> map = new HashMap<>();
        map.put("list", carouselService.getVideoList());
        return new ApiResponse<>(map);

    }


}
