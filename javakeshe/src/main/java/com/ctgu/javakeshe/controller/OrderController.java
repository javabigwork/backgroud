package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.*;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.*;
import com.ctgu.javakeshe.util.TimeGet;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/order")
@RestController
public class OrderController {
    @Resource
    private BookService bookService;
    @Resource
    private AddressService adressService;
    @Resource
    private OrderService orderService;
    @Resource
    private OrderDetailService orderDetailService;

    @Resource
    private DetailDTOService detailDTOService;
    @RequestMapping("/addOrder")
    public AjaxResult addOrder(@RequestBody Order order){
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

    @RequestMapping("/updateStatus")
    public AjaxResult updateStatus(Integer orderid){
        try {
            orderService.updateStatusAuto(orderid);
            return AjaxResult.success();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectByStatus")
    public AjaxResult selectByStatus(@RequestParam("openId")String openid,
                                     @RequestParam("status")Integer status){

        try{List<DetailDTO> list=null;
                if(status==-1){
                    list=detailDTOService.selectAll(openid);
                }else {
                    list = detailDTOService.selectByStatus(openid, status);
                }
                return AjaxResult.success("success",list);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/getCargo")
    public AjaxResult getCargo(Integer orderid){
        try {
            String time=TimeGet.timeget();
            orderService.getCargo(orderid);
            orderService.setTransportDay(time,orderid);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(String openid){
        try {
            List<Order> list=orderService.selectByOpenId(openid);
            return AjaxResult.success("查找成功",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectOne")
    public AjaxResult selectOne(Integer orderid ){
        try {
            List<Order> list=orderService.selectByOrderId(orderid);
            return AjaxResult.success("success",list);
        }catch (Exception e){
            System.out.println(e.getMessage());
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

    @RequestMapping("/buyOne")
    public AjaxResult buyOne(@RequestParam("openId")String openid,
                             @RequestParam("isbn")String isbn,
                             @RequestParam("num")Integer num){
        try {
            DetailPage detailPage=new DetailPage();
            Book book = bookService.selectOneBook(isbn);
            Double money=0.0;
            money=book.getBookNewPrice()*num;
            List<Address> list=adressService.selectByOpenId(openid);
            String time= TimeGet.timeget();
            Order order=null;
            if(list.isEmpty()){
                detailPage.setAddress(null);
                order=new Order(openid,0, money, time,0);
            }else{
                detailPage.setAddress(list.get(0));
                order=new Order(openid,0, money, time,list.get(0).getId());
            }
            orderService.addOrder(order);
            orderDetailService.addDetail(new OrderDetail(isbn, openid, order.getOrderid(),  num));
            detailPage.setMoney(money);
            detailPage.setOrderid(order.getOrderid());
            List<DetailDTO> detailDTO=detailDTOService.selectDetailDTO(order.getOrderid());
            detailPage.setDetailDTO(detailDTO);
            return AjaxResult.success("success",detailPage);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
         return AjaxResult.fail();
        }
    }

    @RequestMapping("/select")
    public AjaxResult select(){
        System.out.println(111);
        try{
            List<Order> list=orderService.selectAll();
            return AjaxResult.success("success",list);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/unpay")
    public AjaxResult unpay(String openid){
        try{
            List<Order> list=orderService.selectUnPay(openid);
            System.out.println(list);
            return AjaxResult.success("success",list);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }
}
