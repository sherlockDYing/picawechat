package com.wechat_study.demo.entity;

public class LinkEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column links.link_id
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    private String linkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column links.bankId
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    private Integer bankid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column links.level
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column links.url
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column links.label
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    private String label;

    public LinkEntity(String linkId, Integer bankid, Integer level, String url, String label) {
        this.linkId = linkId;
        this.bankid = bankid;
        this.level = level;
        this.url = url;
        this.label = label;
    }

    public LinkEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column links.link_id
     *
     * @return the value of links.link_id
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column links.link_id
     *
     * @param linkId the value for links.link_id
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column links.bankId
     *
     * @return the value of links.bankId
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column links.bankId
     *
     * @param bankid the value for links.bankId
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column links.level
     *
     * @return the value of links.level
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column links.level
     *
     * @param level the value for links.level
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column links.url
     *
     * @return the value of links.url
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column links.url
     *
     * @param url the value for links.url
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column links.label
     *
     * @return the value of links.label
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column links.label
     *
     * @param label the value for links.label
     *
     * @mbggenerated Tue Aug 13 14:13:09 CST 2019
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}