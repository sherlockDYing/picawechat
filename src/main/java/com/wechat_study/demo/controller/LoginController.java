// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/7 15:55
 * @ModifyDate 2019/8/7 15:55
 * @Version 1.0
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @ApiOperation(value = "登录")
    @GetMapping(value = "/login")
    public ApiResponse<?> login(
            @ApiParam(name = "code", value = "登录凭证code", required = true, defaultValue = "code") String code) {

        return new ApiResponse<>();
    }

    @ApiOperation(value = "选择/切换身份")
    @GetMapping(value = "/select-identity")
    public ApiResponse<?> selectIdentity(
            @ApiParam(name = "openid", value = "用户唯一标识openid", required = true, defaultValue = "openid") String openid,
            @ApiParam(name = "identity", value = "用户选择的身份", required = true, defaultValue = "student") String identity) {

        return new ApiResponse<>();
    }

}
