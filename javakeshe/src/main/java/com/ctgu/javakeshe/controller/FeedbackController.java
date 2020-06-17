package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;
import com.ctgu.javakeshe.entity.Feedback;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("feedback")
@RestController
public class FeedbackController {

    @Resource
    private FeedbackService feedbackService;

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(){
        List<Feedback> feedbacksList = new ArrayList<>();
        feedbacksList = feedbackService.findFeedback();
        return AjaxResult.success("成功",feedbacksList);
    }

    @PostMapping("/addFeedback")
    public AjaxResult addBook(@RequestBody Feedback feedback){
        feedbackService.addFeedback(feedback);
        return AjaxResult.success("成功","success");
    }
}
