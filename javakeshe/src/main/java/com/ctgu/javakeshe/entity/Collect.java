package com.ctgu.javakeshe.entity;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/15 0:31
 */
public class Collect {
    private int id;
    private String openId;
    private String isbn;

    public Collect() {
    }

    public Collect(int id, String openId, String isbn) {
        this.id = id;
        this.openId = openId;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", openId=" + openId +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
