package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Collect;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.CollectService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public AjaxResult selectAll(@RequestParam("open_id")String open_id){
        System.out.println("good");
        List<Collect> collectList=new ArrayList<>();
        collectList=collectService.selectAllByOpen_id(open_id);
        return  AjaxResult.success("成功",collectList);
    }

    @GetMapping("/deleteCollect")
    public AjaxResult deleteCollection(@RequestParam("id") int id){
        collectService.deleteCollect(id);
        return AjaxResult.success("成功","success");
    }

    @PostMapping("/addCollect")
    public  AjaxResult addCollection(Collect collect){
        collectService.addCollect(collect.getOpen_id(),collect.getIsbn());
        return AjaxResult.success("成功","success");
    }
}
