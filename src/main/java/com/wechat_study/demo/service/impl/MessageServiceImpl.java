// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.model.MessageModel;
import com.wechat_study.demo.service.MessagesService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MessageServiceImpl
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/7 17:52
 * @ModifyDate 2019/8/7 17:52
 * @Version 1.0
 */
@Service
public class MessageServiceImpl  implements MessagesService {
    @Override
    public List<MessageModel> getMessageList(int id) {
        return null;
    }
}
