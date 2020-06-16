package com.ctgu.javakeshe.entity;

import java.util.Date;

public class CommentDTO {
    private Integer id;
    private String openId;
    private String isbn;
    private Date commentDate;
    private User user;
    private String content;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", isbn='" + isbn + '\'' +
                ", commentDate=" + commentDate +
                ", user=" + user +
                ", content='" + content + '\'' +
                '}';
    }
}
