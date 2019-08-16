// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.entity.ArticleResEntityExample;
import com.wechat_study.demo.entity.ResTypeInfoEntity;
import com.wechat_study.demo.entity.ResTypeInfoEntityExample;
import com.wechat_study.demo.mapping.ArticleResEntityMapper;
import com.wechat_study.demo.mapping.ResTypeInfoEntityMapper;
import com.wechat_study.demo.model.ArticleTypeModel;
import com.wechat_study.demo.service.ClassRoomServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClassRoomService
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/16 14:20
 * @ModifyDate 2019/8/16 14:20
 * @Version 1.0
 */
@Service
public class ClassRoomService implements ClassRoomServiceIn {
    @Autowired
    private ArticleResEntityMapper articleResEntityMapper;
    @Autowired
    private ResTypeInfoEntityMapper resTypeInfoEntityMapper;

    private ArticleResEntityExample articleResEntityExample;

    private ResTypeInfoEntityExample resTypeInfoEntityExample;


    @Override
    public List<ArticleTypeModel> getTypeList() {
        resTypeInfoEntityExample = new ResTypeInfoEntityExample();
        ResTypeInfoEntityExample.Criteria criteria = resTypeInfoEntityExample.createCriteria();
        criteria.andIdresTypeInfoIsNotNull();
        List<ResTypeInfoEntity> entityList = resTypeInfoEntityMapper.selectByExample(resTypeInfoEntityExample);
        List<ArticleTypeModel> rsList = null;
        if (entityList != null) {
            rsList = new ArrayList<>();
            for (ResTypeInfoEntity resTypeInfoEntity : entityList) {
                rsList.add(new ArticleTypeModel(resTypeInfoEntity.getIdresTypeInfo(),
                        resTypeInfoEntity.getTypeName()));
            }
        }
        return rsList;
    }

    @Override
    public List<ArticleResEntity> getArticleByType(int typeId) {
        articleResEntityExample = new ArticleResEntityExample();
        ArticleResEntityExample.Criteria criteria = articleResEntityExample.createCriteria();
        if (typeId == 0) {
            criteria.andIdIsNotNull();
        } else {
            criteria.andIdEqualTo(typeId);
        }
        List<ArticleResEntity> articleResEntityList = articleResEntityMapper.selectByExample(articleResEntityExample);
        List<ArticleResEntity> rsList = null;
        if (articleResEntityList != null) {
            rsList = new ArrayList<>();
            for (ArticleResEntity articleResEntity : articleResEntityList) {
                rsList.add(new ArticleResEntity(articleResEntity.getId(),
                        articleResEntity.getUrl(),articleResEntity.getLabel(),articleResEntity.getTypeId()));
            }
        }

        return rsList;
    }

    @Override
    public List<ArticleResEntity> searchArticleByKey() {
        return null;
    }
}