package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.dao.DetailDTODao;
import com.ctgu.javakeshe.entity.*;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.*;
import com.ctgu.javakeshe.util.TimeGet;
import org.springframework.web.bind.annotation.*;

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
    @Resource
    private DetailDTODao detailDTODao;
    @RequestMapping("/deleteAll")
    public AjaxResult deleteAll(String openid){
        try {
            spcService.deleteAll(openid);
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.success();
        }
    }

    @RequestMapping("/deleteOne")
    public AjaxResult deleteOne(Integer id){
        try {
            spcService.deleteOne(id);
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/addCount")
    public AjaxResult AddCount(Integer id){
        try {
            spcService.addCount(id);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/minusCount")
    public AjaxResult MinusCount(Integer id){
        try{
            spcService.minusCount(id);
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/add")
    public AjaxResult Add(@RequestBody ShoppingCar SPC){
        try{
            spcService.addSPC(SPC);
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(String openid){
        try{
            List<ShoppingCar> list=spcService.selectAll(openid);
            return AjaxResult.success("查找成功",list);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/buy")
    public AjaxResult buyBooks(@RequestParam("openId")String openid,
                               @RequestBody @RequestParam("buylist")List<Integer> buy){
       String time= TimeGet.timeget();
        try {
            DetailPage detailPage=new DetailPage();
            Double total=0.0;
            List<ShoppingCar> list3=null;
            for(Integer i:buy){
                ShoppingCar spc=null;
                spc=spcService.selectById(i);
                total+=spc.getCount()*spc.getPrice();
                list3.add(spc);
            }
            List<Address> add=addressService.selectByOpenId(openid);
            Order order=null;
            if(add.isEmpty()) {
                detailPage.setAddress(null);
                order =new Order(openid,0, total, time, 0);
            }else{
                detailPage.setAddress(add.get(0));
                order=new Order(openid,0, total, time, add.get(0).getId());
            }
            orderService.addOrder(order);
            for(ShoppingCar s:list3){
                orderDetailService.addDetail(new OrderDetail(s.getIsbn(),
                        openid, order.getOrderid(), s.getCount()));
                spcService.deleteOne(s.getId());
            }
            for(Integer i:buy){
                spcService.deleteOne(i);
            }
            List<DetailDTO> dlist=detailDTODao.selectDetailDTO(order.getOrderid());
            detailPage.setOrderid(order.getOrderid());
            detailPage.setDetailDTO(dlist);
            detailPage.setMoney(total);
            return AjaxResult.success("success",detailPage);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/selectShoppingCar")
    public AjaxResult selectShoppingCar(@RequestParam("openId") String openId){
        List<ShoppingCar> shoppingCarList = spcService.selectShoppingCar(openId);
        for (int i = 0; i < shoppingCarList.size() ; i++) {
            shoppingCarList.get(i).setOpenid(openId);
        }
        return AjaxResult.success("成功",shoppingCarList);
    }


}
