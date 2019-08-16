// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.response.ApiResponse;
import com.wechat_study.demo.service.impl.ClassRoomService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ClassRoomController
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/16 14:18
 * @ModifyDate 2019/8/16 14:18
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/classroom")
public class ClassRoomController {

    @Autowired
    ClassRoomService classRoomService;

    @GetMapping(value = "/bar")
    @ApiOperation(value = "获取分类列表")
    public ApiResponse<?> getTypeList() {
        Map<String, List<ArticleResEntity>> map = new HashMap<>();

        return new ApiResponse<>(map);
    }

    @GetMapping(value = "/searchByType")
    @ApiOperation(value = "按类型名获取文章列表")
    public ApiResponse<?> getArticleByType(
    @RequestParam("typeId") int typeId){
        return new ApiResponse<>();
    }


    @GetMapping(value = "/searchByKeyword")
    public ApiResponse<?> searchArticleByKey(
            @RequestParam("typeId") int typeId,
            @RequestParam("key") String key){
        return new ApiResponse<>(classRoomService.searchArticleByKey(typeId,key));
    }
}