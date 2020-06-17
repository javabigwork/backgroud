package com.ctgu.javakeshe.dao;


import com.ctgu.javakeshe.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> selectByOpenId(String openid);
    List<Order> selectByOrderId(Integer orderid);
    void updateStatus(Integer orderid);
    Order addOrder(Order order);
    Order selectByOpenIdAndTime(@Param("openid")String openid,@Param("time")String time);
    void getCargo(Integer orderid);
    List<Order> selectAll();
    void setTransportDay(@Param("transportDay") String transportDay,@Param("id")Integer id);
}
