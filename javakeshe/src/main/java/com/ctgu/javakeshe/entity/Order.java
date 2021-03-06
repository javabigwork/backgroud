package com.ctgu.javakeshe.entity;


import java.util.Date;

public class Order {
    private Integer orderid;
    private String openid;
    private Integer status;
    private Double price;
    private String date;
    private Integer addid;
    private String transportDay;
    private Address address;

    public Order() {
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

    public void setAddid(Integer addid) {
        this.addid = addid;
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

    public Integer getAddid() {
        return addid;
    }

    public String getTransportDay(){return transportDay;}

    public void setTransportDay(String transportDay){this.transportDay=transportDay;}

    public Order(Integer orderid, String openid, Integer status, Double price, String date, Integer addid) {
        this.orderid = orderid;
        this.openid = openid;
        this.status = status;
        this.price = price;
        this.date = date;
        this.addid = addid;
    }
    public Order( String openid, Integer status, Double price, String date, Integer addid){
        this.openid = openid;
        this.status = status;
        this.price = price;
        this.date = date;
        this.addid = addid;
    }

    public Order(Integer orderid, String openid, Integer status, Double price, String date, Integer addid, String transportDay, Address address) {
        this.orderid = orderid;
        this.openid = openid;
        this.status = status;
        this.price = price;
        this.date = date;
        this.addid = addid;
        this.transportDay = transportDay;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", openid='" + openid + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", addid=" + addid +
                ", transportDay='" + transportDay + '\'' +
                ", address=" + address +
                '}';
    }
}
