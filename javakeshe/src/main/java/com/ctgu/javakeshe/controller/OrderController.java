package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.Adress;
import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.AdressService;
import com.ctgu.javakeshe.service.BookService;
import com.ctgu.javakeshe.service.OrderDetailService;
import com.ctgu.javakeshe.service.OrderService;
import com.ctgu.javakeshe.util.TimeGet;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx")
@RestController
public class OrderController {
    @Resource
    private BookService bookService;
    @Resource
    private AdressService adressService;
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

    @RequestMapping("order/buyone")
    public AjaxResult buyOne(@RequestParam("openId")String openid,
                             @RequestParam("isbn")String isbn,
                             @RequestParam("num")Integer num){
        try {
            Book book = bookService.selectOneBook(isbn);
            Double money=0.0;
            money=book.getBookNewPrice()*num;
            List<Adress> list=adressService.selectByOpenId(openid);
            String time= TimeGet.timeget();
            orderService.addOrder(new Order(openid,0, money, time));
            Order order=orderService.selectByOpenIdAndTime(openid,time);
            OrderDetail orderDetail=new OrderDetail();
            orderDetailService.addDetail(new OrderDetail(isbn, openid, order.getOrderid(),  num));
            return AjaxResult.success("success",list.get(0));
        }catch (Exception e){
         return AjaxResult.fail();
        }
    }
}
