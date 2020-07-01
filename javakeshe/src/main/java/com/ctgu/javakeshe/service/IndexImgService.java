package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.IndexImg;

import java.util.List;

public interface IndexImgService {
    List<IndexImg> selectAllByType(Integer type);

    void deleteById(Integer id);

//    void addIndexImg(String url, Integer type, String title);
}
