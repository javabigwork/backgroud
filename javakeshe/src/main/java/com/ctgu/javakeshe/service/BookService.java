package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> selectAll();

    Book selectOneBook(String isbn);

    Book updateBook(Book book);

    int deleteBook(String isbn);

    Book addBook(Book book);

    void addBookImg(String isbn, String url, int sort);

    List<Book> selectOneclassificationBook(Integer classificationId);

}
