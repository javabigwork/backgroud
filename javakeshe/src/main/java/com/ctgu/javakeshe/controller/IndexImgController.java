package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.IndexImg;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.IndexImgService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Linyuting
 * @date 2020-07-01 0:05
 * @company CTGU
 */
    @CrossOrigin
    @RequestMapping("qmx/index")
    @RestController
    public class IndexImgController {

        @Resource
        private IndexImgService indexImgService;
        @RequestMapping("/allImg")
        public AjaxResult selectAllByType(Integer type){
            try{
                List<IndexImg> list= indexImgService.selectAllByType(type);
                return AjaxResult.success("success",list);
            }catch (Exception e){
                System.out.println(e.getMessage());
                return AjaxResult.fail();
            }
        }

        @RequestMapping("/delete")
        public AjaxResult delete(Integer id){
            try{
                indexImgService.deleteById(id);
                return AjaxResult.success();
            }catch (Exception e){
                System.out.println(e.getMessage());
                return AjaxResult.fail();
            }
        }
//    @PostMapping("/addIndexImg")
//    public  AjaxResult addIndexImg(IndexImg indexImg){
//        indexImgService.addIndexImg(indexImg.getUrl(),indexImg.getType(),indexImg.getTitle());
//        return AjaxResult.success("成功","success");
//    }


}

