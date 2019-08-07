// Copyright 2016-2101 Pica.
package com.yunqueyi.wechatstudy.model;

import lombok.Data;

/**
 * @ClassName MessageModel
 * @Description 返回信息体
 * @Author caijia.rao
 * @Date 2019/8/7 17:49
 * @ModifyDate 2019/8/7 17:49
 * @Version 1.0
 */
@Data
public class MessageModel {
    private int id;
    private String msg;

    public MessageModel(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

}
