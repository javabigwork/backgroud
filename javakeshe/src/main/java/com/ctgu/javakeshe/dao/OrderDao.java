package com.ctgu.javakeshe.dao;


import com.ctgu.javakeshe.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> selectByOpenId(String openid);
    List<Order> selectByOrderId(Integer orderid);
    void updateStatus(String openid);
    void addOrder(Order order);
}
