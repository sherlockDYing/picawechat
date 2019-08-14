package com.wechat_study.demo;

import com.alibaba.fastjson.JSONObject;
import com.wechat_study.demo.service.CarouselService;
import com.wechat_study.demo.service.LoginService;
import com.wechat_study.demo.service.impl.CarouselServiceImpl;
import com.wechat_study.demo.service.impl.LoginServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHttpConnect() {
        String url = "https://api.weixin.qq.com/sns/jscode2session?"
                + "appid=wx532d861b9298c91b&secret=5b222b1a2dc22b12d1c8f3443fb1cae4"
                +"&js_code=&grant_type=authorization_code";
        LoginServiceImpl loginService = new LoginServiceImpl();
        String rs = loginService.httpRequest(url);
        System.out.println("rs"+rs);
        JSONObject object = JSONObject.parseObject(rs);
        String error_code = object.getString("errcode");
        System.out.println("error code="+error_code);
        String openid = object.getString("openid");
        System.out.println("openid="+openid);
    }



}
