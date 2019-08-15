// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
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

    Map<String, String> getOpenid(String code);

    Map<String, Integer> selectIdentity(String openid, int identity) ;

}
