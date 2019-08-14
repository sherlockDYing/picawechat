// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

import java.util.List;

/**
 * @ClassName QuizModel
 * @Description 题目
 * @Author caijia.rao
 * @Date 2019/8/8 15:49
 * @ModifyDate 2019/8/8 15:49
 * @Version 1.0
 */
@Data
public class QuizModel {

    List<QuestionModel> questionModels;

    int totalPoints;
    /**
     *@Description 标志是否能从题库中取出足够的题目，如果num> bankSize,则为false
     *@Author dingying
     *@Date 2019/8/14 9:57
     *@ModifyDate 2019/8/14 9:57
     */
    boolean isNumFulfil;
}
