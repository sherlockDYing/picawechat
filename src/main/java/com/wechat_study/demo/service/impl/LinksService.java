// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.LinkEntity;
import com.wechat_study.demo.entity.LinkEntityExample;
import com.wechat_study.demo.mapping.LinkEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LinksService
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/13 16:40
 * @ModifyDate 2019/8/13 16:40
 * @Version 1.0
 */

@Service
public class LinksService {


    @Autowired
    private LinkEntityMapper linkEntityMapper;

    private LinkEntityExample linkEntityExample;
    public List<LinkEntity> getResource(double ratio, int bankId){
        int level;
        if(ratio < 0.33){
            level = 1;
        }else if(ratio < 0.6){
            level = 2;
        }else {
            level = 3;
        }
        linkEntityExample = new LinkEntityExample();
       LinkEntityExample.Criteria criteria =  linkEntityExample.createCriteria();
       criteria.andLevelEqualTo(level)
               .andBankidEqualTo(bankId);
      return linkEntityMapper.selectByExample(linkEntityExample);
    }

}