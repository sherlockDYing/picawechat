// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName GradeQueryController
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/9 11:32
 * @ModifyDate 2019/8/9 11:32
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/grade")
public class GradeController {

    @GetMapping(value = "/query")
    @ApiOperation(value = "查询用户成绩")
    public ApiResponse<?> queryGrade(
            @ApiParam(name = "openid", value = "用户唯一标识", required = true, defaultValue = "0")
            @RequestParam(value = "openid") int openid) {
        return new ApiResponse<>();
    }

    @GetMapping(value = "/set")
    @ApiOperation(value = "设置用户分数")
    public ApiResponse<?> setGrade(
            @ApiParam(name = "openid", value = "用户唯一标识", required = true, defaultValue = "0")
            @RequestParam("openid") int openid,
            @ApiParam(name = "bankId", value = "题库id", required = true, defaultValue = "0")
            @RequestParam("bankId") int bankId,
            @ApiParam(name = "grade", value = "成绩", required = true, defaultValue = "0")
            @RequestParam("grade") int grade
    ) {
        return new ApiResponse<>();

    }

}
