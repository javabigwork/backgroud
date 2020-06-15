package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> selectByOpenId(String openid);
    List<Order> selectByOrderId(Integer orderid);
    void updateStatus(Integer orderid);
    void addOrder(Order order);
    Order selectByOpenIdAndTime(String openid,String time);
    void getCargo(Integer orderid);
    List<Order> selectAll();
}