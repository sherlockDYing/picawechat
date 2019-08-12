// Copyright 2016-2101 Pica.
package com.wechat_study.demo.model;

import lombok.Data;

import java.util.List;

/**
 * @ClassName ProblemModel
 * @Description 题目
 * @Author caijia.rao
 * @Date 2019/8/8 15:49
 * @ModifyDate 2019/8/8 15:49
 * @Version 1.0
 */
@Data
public class ProblemModel {
    /**
     题库号
     */
    private int bankId;
    /**
     题号
     */
    private int number;
    /**
     题目名称
     */
    private String question;
    /**
     题目选项
     */
    private List<OptionModel> options;
    /**
     题目答案
     */
    private int answer;
    /**
     题目分数
     */
    private int score;

    public ProblemModel(int bankId, int number, String question, List<OptionModel> options, int answer, int score) {
        this.bankId = bankId;
        this.number = number;
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.score = score;
    }

}
