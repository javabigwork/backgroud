package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Address;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.AddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/address")
@RestController
public class AddressController {

    @Resource
    private AddressService addressService;
    @RequestMapping("/add")
    public AjaxResult add(@RequestBody Address add){
        try{
            System.out.println(add);
            addressService.insertAddress(add);
            return AjaxResult.success();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return AjaxResult.fail();
        }
    }

    @RequestMapping("/delete")
    public AjaxResult delete(Integer id){
        try{
            addressService.deleteById(id);
            return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
    @RequestMapping("/allAddress")
    public AjaxResult selectAll(String id){
        try{
            System.out.println(id);
            List<Address> list= addressService.selectByOpenId(id);
            return AjaxResult.success("success",list);
        }catch (Exception e){
            return AjaxResult.fail();
        }
    }
}
