package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.OrderDetailDao;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailDao orderDetaiolDao;



    @Override
    public List<OrderDetail> selectByOpenId(String openid){
        return orderDetaiolDao.selectByOpenId(openid);
    }

    @Override
    public void addDetail(OrderDetail orderDetail){
        orderDetaiolDao.addDetail(orderDetail);
    }


    @Override
    public List<OrderDetail> selectByOrderId(Integer order){
        return orderDetaiolDao.selectByOrderId(order);
    }

}
