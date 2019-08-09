// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ChatController
 * @Description 聊天
 * @Author caijia.rao
 * @Date 2019/8/7 17:41
 * @ModifyDate 2019/8/7 17:41
 * @Version 1.0
 */
@RestController
@RequestMapping("/chat")
public class ChatController {

    @ApiOperation(value = "根据用户选中题库返回题目内容和答案")
    @GetMapping(value = "/problem")
    public ApiResponse<?> problemChat(
            @ApiParam(name = "bankId",value="用户选中题库ID",required = true,defaultValue = "0")
            @RequestParam("bankId") int bankId){
        return new ApiResponse<>();
    }

    @ApiOperation(value = "获取题库列表")
    @GetMapping(value = "/bank_list")
    public ApiResponse<?> getBankList(){
        return new ApiResponse<>();
    }

}
