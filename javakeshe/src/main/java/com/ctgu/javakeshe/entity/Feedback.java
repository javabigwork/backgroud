package com.ctgu.javakeshe.entity;

import java.util.Date;

public class Feedback {
    private Integer id;
    private String openId;
    private String content;
    private Date feedbackDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", content='" + content + '\'' +
                ", feedbackDate='" + feedbackDate + '\'' +
                '}';
    }
}
