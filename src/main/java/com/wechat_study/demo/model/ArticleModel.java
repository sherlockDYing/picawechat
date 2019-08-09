// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

/**
 * @ClassName ArticleModel
 * @Description 文章
 * @Author caijia.rao
 * @Date 2019/8/9 13:08
 * @ModifyDate 2019/8/9 13:08
 * @Version 1.0
 */
@Data
public class ArticleModel {
    /**
    文章URL
     */
    private String url;
    /**
     文章内容
     */
    private String content;

    public ArticleModel(String url, String content) {
        this.url = url;
        this.content = content;
    }

}
