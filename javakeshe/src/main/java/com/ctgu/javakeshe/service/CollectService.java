package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Collect;
import com.ctgu.javakeshe.entity.CollectDTO;

import java.util.List;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/14 21:10
 */
public interface CollectService {
    //返回该用户收藏的所有书籍
    List<CollectDTO> selectAllByOpen_id(String openId);
    //用户收藏该书籍
    void addCollect(String openId,String isbn);
    //删除该用户收藏的改书籍
    void deleteCollect(int id);

}
