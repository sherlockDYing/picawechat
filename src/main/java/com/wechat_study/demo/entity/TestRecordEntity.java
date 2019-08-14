package com.wechat_study.demo.entity;

import java.util.Date;

public class TestRecordEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.record_id
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private Integer recordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.openid
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.bankId
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private Integer bankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.score
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.total
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private Integer total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test_records.create_time
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    private Date createTime;

    public TestRecordEntity(Integer recordId, String openid, Integer bankid, Integer score, Integer total, Date createTime) {
        this.recordId = recordId;
        this.openid = openid;
        this.bankid = bankid;
        this.score = score;
        this.total = total;
        this.createTime = createTime;
    }

    public TestRecordEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.record_id
     *
     * @return the value of test_records.record_id
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.record_id
     *
     * @param recordId the value for test_records.record_id
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.openid
     *
     * @return the value of test_records.openid
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.openid
     *
     * @param openid the value for test_records.openid
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.bankId
     *
     * @return the value of test_records.bankId
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.bankId
     *
     * @param bankid the value for test_records.bankId
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.score
     *
     * @return the value of test_records.score
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.score
     *
     * @param score the value for test_records.score
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.total
     *
     * @return the value of test_records.total
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.total
     *
     * @param total the value for test_records.total
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test_records.create_time
     *
     * @return the value of test_records.create_time
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test_records.create_time
     *
     * @param createTime the value for test_records.create_time
     *
     * @mbggenerated Wed Aug 14 16:23:33 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}