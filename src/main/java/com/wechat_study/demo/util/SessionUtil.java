// Copyright 2016-2101 Pica.
package com.wechat_study.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SessionUtil
 * @Description TODO
 * @Author caijia.rao
 * @Date 2019/8/13 16:59
 * @ModifyDate 2019/8/13 16:59
 * @Version 1.0
 */
public class SessionUtil {
    public static SqlSession getSqlSession() throws IOException {
        String resource = "../src/main/java/resources/generator/generatorConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
