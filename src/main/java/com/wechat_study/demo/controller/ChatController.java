// Copyright 2016-2101 Pica.
package com.yunqueyi.wechatstudy.controller;

import com.yunqueyi.wechatstudy.response.ApiResponse;
import com.yunqueyi.wechatstudy.service.MessagesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    MessagesService messagesService;

    @ApiOperation(value = "根据用户选中话语返回新的话语")
    @GetMapping(value = "/start-chat")
    public ApiResponse<?> chat(
            @ApiParam(name = "id",value="用户选中话语ID",required = true,defaultValue = "0") Integer id){
        return new ApiResponse<>();
    }

}
