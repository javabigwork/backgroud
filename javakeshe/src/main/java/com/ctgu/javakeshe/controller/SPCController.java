package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.entity.ShoppingCar;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.BookService;
import com.ctgu.javakeshe.service.OrderDetailService;
import com.ctgu.javakeshe.service.OrderService;
import com.ctgu.javakeshe.service.SPCService;
import com.ctgu.javakeshe.util.TimeGet;
import com.ctgu.javakeshe.util.separateUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RequestMapping("SPC")
@RestController
public class SPCController {
    @Resource
    private SPCService spcService;
    @Resource
    private OrderDetailService orderDetailService;
    @Resource
    private OrderService orderService;
    @Resource
    private BookService bookService;

    @RequestMapping("/deleteAll")
    public AjaxResult deleteAll(@RequestParam("openid")String openid){
        try {
            spcService.deleteAll(openid);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.success();
        }
    }

    @RequestMapping("/deleteOne")
    public AjaxResult deleteOne(@RequestParam("id")Integer id){
        try {
            spcService.deleteOne(id);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/AddCount")
    public AjaxResult AddCount(@RequestParam("id")Integer id){
        try {
            spcService.addCount(id);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/MinusCount")
    public AjaxResult MinusCount(@RequestParam("id")Integer id){
        try{
            spcService.minusCount(id);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/Add")
    public AjaxResult Add(@RequestParam("SPC")ShoppingCar SPC){
        try{
            spcService.addSPC(SPC);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(@RequestParam("openid")String openid){
        try{
            List list=spcService.selectAll(openid);
            return AjaxResult.success("查找成功",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/buy")
    public AjaxResult buyBooks(@RequestParam("openId")String openid,
                               @RequestParam("buylist")List<Integer> buy){
       String time= TimeGet.timeget();
        try {
            List<Book> list2=null;

            List<ShoppingCar> list1 = spcService.selectAll(openid);
            Order order=new Order();
            order.setDate(time);
            order.setOpenid(openid);
            Integer total=0;
            for(ShoppingCar s:list1){
//                total+=s.getCount()*s.
            }
//            order.getPrice()
//            orderService.addOrder(new );
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
}
