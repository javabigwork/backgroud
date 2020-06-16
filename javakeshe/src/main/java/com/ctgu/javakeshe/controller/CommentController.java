package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.entity.Comment;
import com.ctgu.javakeshe.entity.CommentDTO;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.CommentService;
import com.ctgu.javakeshe.service.UserService;
import com.ctgu.javakeshe.util.TencentCloud;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("comment")
@RestController
public class CommentController {

    @Resource
    private UserService userService;

    @Resource
    private CommentService commentService;

    @GetMapping("/selectAll")
    public AjaxResult selectAll(@RequestParam("isbn") String isbn){
        List<CommentDTO> commentList = new ArrayList<>();
        commentList = commentService.findCommentAndUserByIsbn(isbn);
        System.out.println(commentList);
        return AjaxResult.success("成功",commentList);
    }

    @PostMapping("/addComment")
    public AjaxResult addBook(@RequestBody Comment comment){
        System.out.println(comment);
        commentService.addComment(comment);
        return AjaxResult.success("成功","success");
    }

    @GetMapping("/deleteComment")
    public AjaxResult deleteBook(@RequestParam("id") Integer id){
        commentService.deleteComment(id);
        return AjaxResult.success("成功","success");
    }
}
