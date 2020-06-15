package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.Address;
import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.entity.OrderDetail;
import com.ctgu.javakeshe.entity.ShoppingCar;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.*;
import com.ctgu.javakeshe.util.TimeGet;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/SPC")
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
    @Resource
    private AddressService addressService;

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
            Double total=0.0;
            List<ShoppingCar> list3=null;
            for(Integer i:buy){
                ShoppingCar spc=null;
                spc=spcService.selectById(i);
                total+=spc.getCount()*spc.getPrice();
                list3.add(spc);
            }
            List<Address> add=addressService.selectByOpenId(openid);
            Address ad= add.get(0);
            orderService.addOrder(new Order(openid,0, total, time, ad.getId()));
            Order order=orderService.selectByOpenIdAndTime(openid,time);
            for(ShoppingCar s:list3){
                orderDetailService.addDetail(new OrderDetail(s.getIsbn(),
                        openid, order.getOrderid(), s.getCount()));
                spcService.deleteOne(s.getId());
            }
            for(Integer i:buy){
                spcService.deleteOne(i);
            }
            return AjaxResult.success("success",add.get(0));
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
}
