package com.ctgu.javakeshe;


import com.ctgu.javakeshe.entity.Order;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/test")
@RestController
public class Test {
    @Resource
    private OrderService orderService;
    @RequestMapping("/selectAll")
    public AjaxResult selectAll(){
        try {
            List<Order> list=orderService.selectAll();
            return AjaxResult.success("success",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
}
