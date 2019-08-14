// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

import java.util.List;

/**
 * @ClassName QuestionModel
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/13 17:06
 * @ModifyDate 2019/8/13 17:06
 * @Version 1.0
 */
@Data
public class QuestionModel {
    /**
     题库号
     */
    private int bankId;

    /**
     题目名称
     */
    private String content;
    /**
     题目选项
     */
    private String[] options;
    /**
     题目答案
     */
    private int answerOffset;
    /**
     题目分数
     */
    private int value;
}