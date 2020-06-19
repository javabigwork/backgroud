package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Classification;
import com.ctgu.javakeshe.entity.ClassificationNUm;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.ClassificationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/classification")
@RestController
public class ClassificationController {

    @Resource
    private ClassificationService classificationService;




    @RequestMapping("/selectclassification")
    public AjaxResult selectclassification(){
        List<Classification> classificationList = classificationService.selectclassification();
        return AjaxResult.success("成功",classificationList);
    }

    /**
     * todo
     * @param classification
     * @return
     */
    @RequestMapping("/addclassification")
    public AjaxResult addclassification(Classification classification){
        System.out.println(classification.getClassificationName());
        classificationService.addclassification(classification);
        return AjaxResult.success("成功","sucess");
    }

    /**
     * todo
     * @param classification
     * @return
     */
    @RequestMapping("/updateclassification")
    public AjaxResult updateclassification(Classification classification){
        classificationService.updateclassification(classification);
        return AjaxResult.success("成功","success");
    }

    @RequestMapping("/deleteclassification")
    public AjaxResult deleteclassification(@RequestParam("classificationId") Integer classificationId){
        classificationService.deleteclassification(classificationId);
        return AjaxResult.success("成功","success");
    }

    @RequestMapping("/selectnumofclassification")
    public AjaxResult selectnumofclassification(){
        List<ClassificationNUm> classificationNUmList = classificationService.selectnumofclassification();
        return AjaxResult.success("成功",classificationNUmList);
    }

    @RequestMapping("selectoneclassification")
    public AjaxResult selectoneclassification(@RequestParam("classificationId") Integer classificationId){
        Classification classification = classificationService.selectoneclassification(classificationId);
        System.out.println(classification);
        return AjaxResult.success("成功",classification);
    }
}
