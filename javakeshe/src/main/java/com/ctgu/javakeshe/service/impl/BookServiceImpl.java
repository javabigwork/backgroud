package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.BookDao;
import com.ctgu.javakeshe.entity.Book;
import com.ctgu.javakeshe.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
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
}
