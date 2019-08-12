// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

/**
 * @ClassName OptionModel
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/9 13:16
 * @ModifyDate 2019/8/9 13:16
 * @Version 1.0
 */
@Data
public class OptionModel {
    /**
     选项序号
     */
    private int optionNumber;
    /**
     选项内容
     */
    private String optionContent;

    public OptionModel(int optionNumber, String optionContent) {
        this.optionNumber = optionNumber;
        this.optionContent = optionContent;
    }

}
