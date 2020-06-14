package com.ctgu.javakeshe.entity;


import java.util.Date;

public class Order {
    private Integer orderid;
    private String openid;
    private Integer status;
    private Double price;
    private String date;

    public Order(Integer orderid, String openid, Integer status, Double price, String date) {
        this.orderid = orderid;
        this.openid = openid;
        this.status = status;
        this.price = price;
        this.date = date;
    }
    public Order( String openid, Integer status, Double price, String date) {
        this.openid = openid;
        this.status = status;
        this.price = price;
        this.date = date;
    }

    public Order(){}
    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", openid='" + openid + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public String getOpenid() {
        return openid;
    }

    public Integer getStatus() {
        return status;
    }

    public Double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }
}
