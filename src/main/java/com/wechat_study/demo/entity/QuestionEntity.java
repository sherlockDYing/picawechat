package com.wechat_study.demo.entity;

public class QuestionEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.question_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private String questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.bank_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private Integer bankId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.kind
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private String kind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.contents
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private String contents;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.answer_offset
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private Integer answerOffset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.answer
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.value
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private Integer value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.options
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    private String options;

    public QuestionEntity(String questionId, Integer bankId, String kind, String contents, Integer answerOffset, String answer, Integer value, String options) {
        this.questionId = questionId;
        this.bankId = bankId;
        this.kind = kind;
        this.contents = contents;
        this.answerOffset = answerOffset;
        this.answer = answer;
        this.value = value;
        this.options = options;
    }

    public QuestionEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.question_id
     *
     * @return the value of questions.question_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.question_id
     *
     * @param questionId the value for questions.question_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.bank_id
     *
     * @return the value of questions.bank_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.bank_id
     *
     * @param bankId the value for questions.bank_id
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.kind
     *
     * @return the value of questions.kind
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public String getKind() {
        return kind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.kind
     *
     * @param kind the value for questions.kind
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.contents
     *
     * @return the value of questions.contents
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public String getContents() {
        return contents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.contents
     *
     * @param contents the value for questions.contents
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.answer_offset
     *
     * @return the value of questions.answer_offset
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public Integer getAnswerOffset() {
        return answerOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.answer_offset
     *
     * @param answerOffset the value for questions.answer_offset
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setAnswerOffset(Integer answerOffset) {
        this.answerOffset = answerOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.answer
     *
     * @return the value of questions.answer
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.answer
     *
     * @param answer the value for questions.answer
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.value
     *
     * @return the value of questions.value
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.value
     *
     * @param value the value for questions.value
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.options
     *
     * @return the value of questions.options
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public String getOptions() {
        return options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.options
     *
     * @param options the value for questions.options
     *
     * @mbggenerated Tue Aug 13 10:27:47 CST 2019
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }
}