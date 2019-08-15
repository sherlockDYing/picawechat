// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import com.wechat_study.demo.service.LoginService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    @Autowired
    LoginService loginService;

    @ApiOperation(value = "登录")
    @PostMapping(value = "")
    public ApiResponse<?> login(
            @ApiParam(name = "code", value = "登录凭证code", required = true, defaultValue = "code")
            @RequestBody String code) {
        return new ApiResponse<>(loginService.getOpenid(code));
    }

    @ApiOperation(value = "选择身份")
    @PostMapping(value = "/identity")
    public ApiResponse<?> selectIdentity(
            @ApiParam(name = "openid", value = "用户唯一标识openid", required = true, defaultValue = "openid")
            @RequestParam String openid,
            @ApiParam(name = "identity", value = "用户选择身份, 0获取身份信息，1设置身份信息", required = true, defaultValue = "0")
            @RequestParam int identity) {
        return new ApiResponse<>(loginService.selectIdentity(openid, identity));
    }

}
