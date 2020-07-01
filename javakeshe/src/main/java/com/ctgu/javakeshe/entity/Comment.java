package com.ctgu.javakeshe.entity;

import java.util.Date;

public class Comment {
    private Integer id;
    private String openId;
    private String isbn;
    private String content;
    private Date commentDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", isbn='" + isbn + '\'' +
                ", content='" + content + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
