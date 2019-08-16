// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

/**
 * @ClassName ArticleTypeModel
 * @Description 文章类型model
 * @Author caijia.rao
 * @Date 2019/8/16 15:11
 * @ModifyDate 2019/8/16 15:11
 * @Version 1.0
 */
@Data
public class ArticleTypeModel {
    private int id;
    private String type;

    public ArticleTypeModel(int id, String type) {
        this.id = id;
        this.type = type;
    }

}
