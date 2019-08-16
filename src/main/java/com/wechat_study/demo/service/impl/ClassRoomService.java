// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.ArticleResEntity;
import com.wechat_study.demo.entity.ArticleResEntityExample;
import com.wechat_study.demo.entity.ResTypeInfoEntity;
import com.wechat_study.demo.mapping.ArticleResEntityMapper;
import com.wechat_study.demo.mapping.ResTypeInfoEntityMapper;
import com.wechat_study.demo.service.ClassRoomServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    ArticleResEntityMapper articleResEntityMapper;
    @Autowired
    ResTypeInfoEntityMapper resTypeInfoEntityMapper;


    @Override
    public List<ResTypeInfoEntity> getTypeList() {
        return null;
    }

    @Override
    public List<ArticleResEntity> getArticleByType() {
        return null;
    }

    @Override
    public List<ArticleResEntity> searchArticleByKey(int typeId,String key) {
        ArticleResEntityExample articleResEntityExample = new ArticleResEntityExample();
        ArticleResEntityExample.Criteria criteria = articleResEntityExample.createCriteria();
        if(typeId == 0){
        criteria.andLabelLike("%"+key+"%");
        }else {
            criteria.andLabelLike("%"+key+"%")
                    .andTypeIdEqualTo(typeId);
        }
        return articleResEntityMapper.selectByExample(articleResEntityExample);
    }
}