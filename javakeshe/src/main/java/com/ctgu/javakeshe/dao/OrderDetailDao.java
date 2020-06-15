package com.ctgu.javakeshe.dao;


import com.ctgu.javakeshe.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailDao {
    List<OrderDetail> selectByOpenId(String openid);
    void addDetail(OrderDetail orderDetail);
    List<OrderDetail> selectByOrderId(Integer orderid);
}
