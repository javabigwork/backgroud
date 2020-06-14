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
}
