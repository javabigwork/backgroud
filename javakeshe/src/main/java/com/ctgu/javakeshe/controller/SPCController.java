package com.ctgu.javakeshe.controller;


import com.ctgu.javakeshe.entity.ShoppingCar;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.SPCService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("SPC")
@RestController
public class SPCController {
    @Resource
    private SPCService spcService;
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
    public AjaxResult selectAll(@RequestParam("openid")Integer openid){
        try{
            List list=spcService.selectAll(openid);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/buy")
    public AjaxResult
}
