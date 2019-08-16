// Copyright 2016-2101 Pica.
package com.wechat_study.demo.service.impl;

import com.wechat_study.demo.entity.BankInfoEntity;
import com.wechat_study.demo.entity.BankInfoEntityExample;
import com.wechat_study.demo.entity.QuestionEntity;
import com.wechat_study.demo.entity.QuestionEntityExample;
import com.wechat_study.demo.mapping.BankInfoEntityMapper;
import com.wechat_study.demo.mapping.QuestionEntityMapper;
import com.wechat_study.demo.model.QuestionModel;
import com.wechat_study.demo.model.QuizModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.logging.Logger;

/**
 * @ClassName ChatService
 * @Description TODO
 * @Author dingying
 * @Date 2019/8/12 16:05
 * @ModifyDate 2019/8/12 16:05
 * @Version 1.0
 */
@Service
public class ChatService {
    @Autowired
    QuestionEntityMapper   questionEntityMapper;

    QuestionEntityExample questionEntityExample;

    @Autowired
    BankInfoEntityMapper bankInfoEntityMapper;

    BankInfoEntityExample bankInfoEntityExample;


    public QuizModel getQuiz(int bankId,int num) {
        List<QuestionEntity> questionEntities;
        questionEntityExample = new QuestionEntityExample();
        QuestionEntityExample.Criteria criteria = questionEntityExample.createCriteria();
        criteria.andBankidEqualTo(bankId);
        int bankSize = questionEntityMapper.countByExample(questionEntityExample);

        if (num <= bankSize) {
            //在bankSize里随机抽取num条题目；
            List<Integer> index = new ArrayList<>();
            Random random = new Random();
            int min = 1;
            int max = bankSize;
            while (index.size()!= num){
                int randomNumber =  random.nextInt(max)%(max-min+1) + min;
                if(!index.contains(randomNumber)){
                index.add(randomNumber);
                }
            }
            criteria.andSonIdIn(index);
            questionEntities = questionEntityMapper.selectByExample(questionEntityExample);
            return assembleQuiz(questionEntities,(questionEntities.size() == num));
        } else {
            questionEntities = questionEntityMapper.selectByExample(questionEntityExample);
            return assembleQuiz(questionEntities,(questionEntities.size() == num));
        }
    }

    private QuizModel assembleQuiz(List<QuestionEntity> questionEntities, boolean isNumFulFil){
        if (questionEntities != null) {
            int totalPoints = 0;
            List<QuestionModel> questions = new ArrayList<>();
            QuizModel quizModel = new QuizModel();
            //entity split选项，封装成 model；累计总分；加入quiz的list
            for (QuestionEntity q : questionEntities) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setOptions(q.getOptions().split("&"));
                //题库
                questionModel.setBankId(q.getBankid());
                //题干
                questionModel.setContent(q.getContents());
                //每题分值
                questionModel.setValue(q.getValue());
                //正确选项，从0开始数
                questionModel.setAnswerOffset(q.getAnswerOffset());
                //计算总分
                totalPoints += q.getValue();
                questions.add(questionModel);
            }
            quizModel.setTotalPoints(totalPoints);
            quizModel.setQuestionModels(questions);
            quizModel.setNumFulfil(isNumFulFil);
            return quizModel;
        }else {
            return null;
        }
    }

    public List<BankInfoEntity> getAllBankInfo(){
        bankInfoEntityExample = new BankInfoEntityExample();
        bankInfoEntityExample.clear();
        BankInfoEntityExample.Criteria criteria = bankInfoEntityExample.createCriteria();
        criteria.andBankNameIsNotNull();
       return bankInfoEntityMapper.selectByExample(bankInfoEntityExample);
    }


}