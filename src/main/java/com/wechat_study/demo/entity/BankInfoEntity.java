package com.wechat_study.demo.entity;

public class BankInfoEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bank_info.bankId
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    private Integer bankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bank_info.bank_name
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    private String bankName;

    public BankInfoEntity(Integer bankid, String bankName) {
        this.bankid = bankid;
        this.bankName = bankName;
    }

    public BankInfoEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bank_info.bankId
     *
     * @return the value of bank_info.bankId
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bank_info.bankId
     *
     * @param bankid the value for bank_info.bankId
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bank_info.bank_name
     *
     * @return the value of bank_info.bank_name
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bank_info.bank_name
     *
     * @param bankName the value for bank_info.bank_name
     *
     * @mbggenerated Fri Aug 16 11:43:36 CST 2019
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }
}