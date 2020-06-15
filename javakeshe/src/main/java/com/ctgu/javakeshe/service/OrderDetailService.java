package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> selectByOpenId(String openid);
    void addDetail(OrderDetail orderDetail);
    List<OrderDetail> selectByOrderId(Integer orderid);

}
