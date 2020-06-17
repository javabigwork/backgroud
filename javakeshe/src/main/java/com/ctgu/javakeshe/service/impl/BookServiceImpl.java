package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.BookDao;
import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectOneBook(String isbn) {
        return bookDao.selectOneBook(isbn);
    }

    @Override
    public Book updateBook(Book book) {
        this.bookDao.updateBook(book);
        return this.selectOneBook(book.getIsbn());
    }

    @Override
    public int deleteBook(String isbn) {
        return bookDao.deleteBook(isbn);
    }

    @Override
    public Book addBook(Book book) {
        this.bookDao.addBook(book);
        return book;
    }

    @Override
    public void addBookImg(String isbn, String url, int sort) {
        Map<String,Object> bookImgMap = new HashMap<>();
        bookImgMap.put("isbn",isbn);
        bookImgMap.put("url",url);
        bookImgMap.put("sort",sort);
        bookDao.addBookImg(bookImgMap);
    }

    @Override
    public List<Book> selectOneclassificationBook(Integer classificationId) {
        return bookDao.selectOneclassificationBook(classificationId);
    }
}
