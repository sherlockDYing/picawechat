package com.wechat_study.demo.entity;

public class CarouselResEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carousel_resources.id
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carousel_resources.type
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carousel_resources.url
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carousel_resources.label
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    private String label;

    public CarouselResEntity(Integer id, Integer type, String url, String label) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.label = label;
    }

    public CarouselResEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carousel_resources.id
     *
     * @return the value of carousel_resources.id
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carousel_resources.id
     *
     * @param id the value for carousel_resources.id
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carousel_resources.type
     *
     * @return the value of carousel_resources.type
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carousel_resources.type
     *
     * @param type the value for carousel_resources.type
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carousel_resources.url
     *
     * @return the value of carousel_resources.url
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carousel_resources.url
     *
     * @param url the value for carousel_resources.url
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carousel_resources.label
     *
     * @return the value of carousel_resources.label
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carousel_resources.label
     *
     * @param label the value for carousel_resources.label
     *
     * @mbggenerated Tue Aug 13 15:34:30 CST 2019
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}