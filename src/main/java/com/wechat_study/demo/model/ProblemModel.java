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
     题目名称
     */
    private String content;
    /**
     题目选项
     */
    private List<String> options;
    /**
     题目答案
     */
    private int answerOffset;

    private String answer;
    /**
     题目分数
     */
    private int value;

    public ProblemModel(int bankId, String content, List<String> options, int answerOffset,String answer, int value) {
        this.bankId = bankId;
        this.content = content;
        this.options = options;
        this.answerOffset = answerOffset;
        this.answer = answer;
        this.value = value;
    }

}
