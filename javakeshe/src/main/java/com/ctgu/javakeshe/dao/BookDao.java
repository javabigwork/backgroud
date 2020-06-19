package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookDao {

    List<Book> selectAll();

    Book selectOneBook(String isbn);

    int updateBook(Book book);

    int deleteBook(String isbn);

    int addBook(Book book);

    void addBookImg(Map<String,Object> map);

    List<Book> selectOneclassificationBook(Integer classificationId);
}
