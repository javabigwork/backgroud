package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx")
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(){
        List<Book> bookList = new ArrayList<>();
        bookList=bookService.selectAll();
        System.out.println(bookList);
        return AjaxResult.success("成功",bookList);
    }
}
