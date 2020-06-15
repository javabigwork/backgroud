package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.OrderDao;
import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Override
    public List<Order> selectByOpenId(String openid){
        return orderDao.selectByOpenId(openid);
    }
    @Override
    public List<Order> selectByOrderId(Integer orderid){
        return orderDao.selectByOrderId(orderid);
    }
    @Override
    public void updateStatus(Integer openid){
        orderDao.updateStatus(openid);
    }
    @Override
    public void addOrder(Order order){
        orderDao.addOrder(order);
    }

    @Override
    public Order selectByOpenIdAndTime(String openid, String time){
        return orderDao.selectByOpenIdAndTime(openid,time);
    }

    @Override
    public void getCargo(Integer orderid){
        orderDao.getCargo(orderid);
    }

    @Override
    public List<Order> selectAll(){
        return orderDao.selectAll();
    }
}