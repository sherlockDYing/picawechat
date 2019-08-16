package com.wechat_study.demo.entity;

public class VideoResEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_resources.id
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_resources.url
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_resources.imgurl
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    private String imgurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_resources.label
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    private String label;

    public VideoResEntity(Integer id, String url, String imgurl, String label) {
        this.id = id;
        this.url = url;
        this.imgurl = imgurl;
        this.label = label;
    }

    public VideoResEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_resources.id
     *
     * @return the value of video_resources.id
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_resources.id
     *
     * @param id the value for video_resources.id
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_resources.url
     *
     * @return the value of video_resources.url
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_resources.url
     *
     * @param url the value for video_resources.url
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_resources.imgurl
     *
     * @return the value of video_resources.imgurl
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_resources.imgurl
     *
     * @param imgurl the value for video_resources.imgurl
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_resources.label
     *
     * @return the value of video_resources.label
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_resources.label
     *
     * @param label the value for video_resources.label
     *
     * @mbggenerated Thu Aug 15 17:18:22 CST 2019
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}