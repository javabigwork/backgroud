package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {

    List<Book> selectAll();
}
