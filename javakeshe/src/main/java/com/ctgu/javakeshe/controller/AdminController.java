package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Admin;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RequestMapping("qmx/admin")
@RestController
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    public AjaxResult login(@RequestBody Admin admin){
        Admin newAdmin = adminService.login(admin);
        if(newAdmin == null){
            return AjaxResult.fail("失败","fail");
        }else{
            return AjaxResult.success("成功","success");
        }
    }

    @RequestMapping("/info")
    public AjaxResult login(){
        return AjaxResult.success("成功","success");
    }
}
