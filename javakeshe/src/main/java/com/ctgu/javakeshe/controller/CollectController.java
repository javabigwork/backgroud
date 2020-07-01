package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Collect;
import com.ctgu.javakeshe.entity.CollectDTO;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.CollectService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/14 21:55
 */
@CrossOrigin
@RequestMapping("qmx/collect")
@RestController
public class CollectController {
    @Resource
    private CollectService collectService;

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(@RequestParam("openId")String openId){
        List<CollectDTO> collectList=collectService.selectAllByOpen_id(openId);
        return  AjaxResult.success("成功了吗",collectList);
    }

    @GetMapping("/deleteCollect")
    public AjaxResult deleteCollection(@RequestParam("id") int id){
        collectService.deleteCollect(id);
        return AjaxResult.success("成功","success");
    }

    @GetMapping("/addCollect")
    public  AjaxResult addCollection(@RequestParam("openId")String openId,@RequestParam("isbn")String isbn){
        collectService.addCollect(openId,isbn);
        return AjaxResult.success("成功","success");
    }
}
