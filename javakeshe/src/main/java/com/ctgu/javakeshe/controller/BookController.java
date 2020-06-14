package com.ctgu.javakeshe.controller;

import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.filter.AjaxResult;
import com.ctgu.javakeshe.service.BookService;
import com.ctgu.javakeshe.util.TencentCloud;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("qmx/book")
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("/selectAll")
    public AjaxResult selectAll(){
        List<Book> bookList = new ArrayList<>();
        bookList=bookService.selectAll();
        return AjaxResult.success("成功",bookList);
    }

    @GetMapping("/selectOneBook")
    public AjaxResult selectOneBook(@RequestParam("isbn") String isbn){
        Book book = new Book();
        book = bookService.selectOneBook(isbn);
        return AjaxResult.success("成功",book);
    }

    /**
     * 待测试 功能
     * @param book
     * @return
     */
    @RequestMapping("/updateBook")
    public AjaxResult updateBook(Book book){
        bookService.updateBook(book);
        return AjaxResult.success("成功","success");
    }

    @GetMapping("/deleteBook")
    public AjaxResult deleteBook(@RequestParam("isbn") String isbn){
        bookService.deleteBook(isbn);
        return AjaxResult.success("成功","success");
    }


    @PostMapping("/addBook")
    public AjaxResult addBook(Book book){
        bookService.addBook(book);
        String[] tt=book.getBookImgPath().split("\\s+");
        int sort = 1;
        for(String s:tt)
        {
            String url = TencentCloud.Upload("images", "C:\\Users\\罗闯\\Desktop\\" + s);
            bookService.addBookImg(book.getIsbn(),url,sort);
            sort++;
        }
        return AjaxResult.success("成功","success");
    }
}
