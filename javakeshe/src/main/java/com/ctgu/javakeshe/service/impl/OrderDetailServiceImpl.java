package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.OrderDetailDao;
import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.service.OrderDetailService;
import com.ctgu.javakeshe.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailDao orderDao;

    @Override
    public List<OrderDetail> selectByOpenId(String openid){
        return orderDao.selectByOpenId(openid);
    }

    @Override
    public void addDetail(OrderDetail orderDetail){
        orderDao.addDetail(orderDetail);
    }
}
