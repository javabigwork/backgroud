package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Collect;
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
    List<Collect> selectAllByOpen_id(String openId);
    //用户收藏该书籍
    Collect addCollect(Map<String,String> map);
    //删除该用户收藏的改书籍
    void deleteCollect(int id);
}
