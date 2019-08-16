// Copyright 2016-2101 Pica.
package com.wechat_study.demo.controller;

import com.wechat_study.demo.response.ApiResponse;
import com.wechat_study.demo.service.impl.ChatService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    ChatService chatService;

    @ApiOperation(value = "根据用户选中题库返回题目内容、答案、总分")
    @GetMapping(value = "/quiz")
    public ApiResponse<?> getQuiz(
            @ApiParam(name = "bankId",value="用户选中题库ID",required = true,defaultValue = "0")
            @RequestParam("bankId") int bankId,
            @ApiParam(name = "num" , value = "用户选择做多少道题目", required = true,defaultValue = "0")
            @RequestParam("num")int num){
        return new ApiResponse<>(chatService.getQuiz(bankId,num));
    }

    @ApiOperation(value = "获取题库列表")
    @GetMapping(value = "/bank_list")
    public ApiResponse<?> getBankList(){
        return new ApiResponse<>(chatService.getAllBankInfo());
    }

}
