// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/13 9:49
 * @ModifyDate 2019/8/13 9:49
 * @Version 1.0
 */
@Service
public interface LoginService {

    /**
     * @Description 根据临时凭证获取openid并判断是否已有该用户，如果没有则新建数据库该用户
     * @Author caijia.rao
     * @Date 2019/8/13 17:54
     * @ModifyDate 2019/8/13 17:54
     * @Params [code]
     * @Return java.util.Map<java.lang.String, java.lang.String>
     */
    Map<String, String> getOpenid(String code);

    /**
     * @Description 根据openid查找用户，identity为0为查询，不为0为设置
     * @Author caijia.rao
     * @Date 2019/8/13 17:56
     * @ModifyDate 2019/8/13 17:56
     * @Params [openid, identity]
     * @Return java.util.Map<java.lang.String, java.lang.Integer>
     */
    Map<String, Integer> selectIdentity(String openid, int identity);

}
