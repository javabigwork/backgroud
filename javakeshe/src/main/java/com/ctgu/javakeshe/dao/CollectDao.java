package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Collect;
import com.ctgu.javakeshe.entity.CollectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/14 21:23
 */
@Mapper
public interface CollectDao {
    //返回该用户收藏的所有书籍
    List<CollectDTO> selectAllByOpen_id(String openId);
    //用户收藏该书籍
    void addCollect(String openId,String isbn,String date);
    //删除该用户收藏的改书籍
    void deleteCollect(int id);

    Collect selectIfCollect(String openId,String isbn);
}
