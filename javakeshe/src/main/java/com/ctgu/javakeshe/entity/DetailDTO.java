package com.ctgu.javakeshe.entity;

import java.util.List;

public class DetailDTO {
    private Integer id;
    private String isbn;
    private String openid;
    private Integer orderid;
    private Integer orderNum;
    private Book book;
    private List<BookImg> bookImg;

    public DetailDTO(){}

    @Override
    public String toString() {
        return "DetailDTO{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", openid='" + openid + '\'' +
                ", orderid=" + orderid +
                ", orderNum=" + orderNum +
                ", book=" + book +
                ", bookImg=" + bookImg +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBookImg(List<BookImg> bookImg) {
        this.bookImg = bookImg;
    }

    public Integer getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getOpenid() {
        return openid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public Book getBook() {
        return book;
    }

    public List<BookImg> getBookImg() {
        return bookImg;
    }

    public DetailDTO(Integer id, String isbn, String openid, Integer orderid, Integer orderNum, Book book, List<BookImg> bookImg) {
        this.id = id;
        this.isbn = isbn;
        this.openid = openid;
        this.orderid = orderid;
        this.orderNum = orderNum;
        this.book = book;
        this.bookImg = bookImg;
    }
}
