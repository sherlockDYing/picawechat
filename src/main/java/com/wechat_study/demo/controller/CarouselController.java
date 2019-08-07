// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "")
    @ApiOperation(value = "获取轮播列表")
    public ApiResponse<?> getCarouselList(){

    }


}
