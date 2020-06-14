package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.OrderDetailService;
import com.ctgu.javakeshe.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx")
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private OrderDetailService orderDetailService;
    @RequestMapping("/addOrder")
    public AjaxResult addOrder(@RequestParam("order")Order order){
        try {
            orderService.addOrder(order);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/confirm")
    public AjaxResult confirmOrder(Integer orderid){
        try{
            orderService.updateStatus(orderid);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/order/selectAll")
    public AjaxResult selectAll(String openid){
        try {
            List<Order> list=orderService.selectByOpenId(openid);
            return AjaxResult.success("查找成功",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/order/selectOne")
    public AjaxResult selectOne(Integer orderid ){
        try {
            List<Order> list=orderService.selectByOrderId(orderid);
            return AjaxResult.success("success",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/detail/selectOne")
    public AjaxResult selectDetailOne(Integer orderid){
        try {
            List<OrderDetail> list=orderDetailService.selectByOrderId(orderid);
            return AjaxResult.success("success",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
}
