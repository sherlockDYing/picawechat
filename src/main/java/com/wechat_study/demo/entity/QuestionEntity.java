package com.wechat_study.demo.entity;

public class QuestionEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.question_id
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private Integer questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.bankId
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private Integer bankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.son_id
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private Integer sonId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.contents
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private String contents;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.answer_offset
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private Integer answerOffset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.value
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private Integer value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questions.options
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    private String options;

    public QuestionEntity(Integer questionId, Integer bankid, Integer sonId, String contents, Integer answerOffset, Integer value, String options) {
        this.questionId = questionId;
        this.bankid = bankid;
        this.sonId = sonId;
        this.contents = contents;
        this.answerOffset = answerOffset;
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.question_id
     *
     * @param questionId the value for questions.question_id
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.bankId
     *
     * @return the value of questions.bankId
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.bankId
     *
     * @param bankid the value for questions.bankId
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.son_id
     *
     * @return the value of questions.son_id
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public Integer getSonId() {
        return sonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questions.son_id
     *
     * @param sonId the value for questions.son_id
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public void setSonId(Integer sonId) {
        this.sonId = sonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.contents
     *
     * @return the value of questions.contents
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public void setAnswerOffset(Integer answerOffset) {
        this.answerOffset = answerOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questions.value
     *
     * @return the value of questions.value
     *
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
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
     * @mbggenerated Wed Aug 14 15:26:50 CST 2019
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }
}