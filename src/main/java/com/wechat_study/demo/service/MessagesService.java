// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import com.wechat_study.demo.model.MessageModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MessagesService
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/7 17:51
 * @ModifyDate 2019/8/7 17:51
 * @Version 1.0
 */
@Service
public interface MessagesService {

    List<MessageModel> getMessageList(int id);

}