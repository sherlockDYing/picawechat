// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

/**
 * @ClassName VideoModel
 * @Description 视频
 * @Author caijia.rao
 * @Date 2019/8/9 13:08
 * @ModifyDate 2019/8/9 13:08
 * @Version 1.0
 */
@Data
public class VideoModel {
    /**
     视频URL
     */
    private String url;

    public VideoModel(String url) {
        this.url = url;
    }
}
