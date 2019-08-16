// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

/**
 * @ClassName ArticleModel
 * @Description 文章model
 * @Author caijia.rao
 * @Date 2019/8/16 11:33
 * @ModifyDate 2019/8/16 11:33
 * @Version 1.0
 */
@Data
public class ArticleModel {

    private int id;
    private String url;
    private String label;

    public ArticleModel(int id, String url, String label) {
        this.id = id;
        this.url = url;
        this.label = label;
    }
}
