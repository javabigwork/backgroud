package com.ctgu.javakeshe.entity;


public class OrderDetail {
private Integer id;
private String isbn;
private String openid;
private Integer orderid;
private Integer orderNum;

public OrderDetail(){}
    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", openid='" + openid + '\'' +
                ", orderid=" + orderid +
                ", orderNum=" + orderNum +
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

    public OrderDetail(Integer id, String isbn, String openid, Integer orderid, Integer orderNum) {
        this.id = id;
        this.isbn = isbn;
        this.openid = openid;
        this.orderid = orderid;
        this.orderNum = orderNum;
    }
    public OrderDetail( String isbn, String openid, Integer orderid, Integer orderNum) {
        this.isbn = isbn;
        this.openid = openid;
        this.orderid = orderid;
        this.orderNum = orderNum;
    }
}
