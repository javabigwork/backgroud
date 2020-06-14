package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RequestMapping("qmx")
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/addOrder")
    public AjaxResult addOrder(@RequestParam("order")Order order){
        try {
            orderService.addOrder(order);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }


}
