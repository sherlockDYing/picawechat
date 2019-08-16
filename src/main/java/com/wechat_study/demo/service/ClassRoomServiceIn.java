// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.entity.ResTypeInfoEntity;
import com.wechat_study.demo.model.ArticleModel;
import com.wechat_study.demo.model.ArticleTypeModel;

import java.util.List;

/**
 * @ClassName ClassRoomServiceIn
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/16 14:31
 * @ModifyDate 2019/8/16 14:31
 * @Version 1.0
 */
public interface ClassRoomServiceIn {
    /**
     * @Description 云鹊小讲堂获取分类列表信息
     * @Author caijia.rao
     * @Date 2019/8/16 15:15
     * @ModifyDate 2019/8/16 15:15
     * @Params []
     * @Return java.util.List<com.wechat_study.demo.model.ArticleTypeModel>
     */
    List<ArticleTypeModel> getTypeList();

    /**
     * @Description 云鹊小讲堂根据分类获取文章列表
     * @Author caijia.rao
     * @Date 2019/8/16 15:15
     * @ModifyDate 2019/8/16 15:15
     * @Params []
     * @Return java.util.List<com.wechat_study.demo.model.ArticleModel>
     */
    List<ArticleModel> getArticleByType(int typeId);

    /**
     * @Description TODO 云鹊小讲堂根据关键字匹配搜索文章
     * @Author dingying
     * @Date 2019/8/16 14:36
     * @ModifyDate 2019/8/16 14:36
     * @Params []
     * @Return java.util.List<com.wechat_study.demo.entity.ArticleResEntity>
     */
    List<ArticleResEntity> searchArticleByKey();
}
