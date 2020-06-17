package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.ShoppingCar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SPCDao {
    void deleteAll(String openid);
    void deleteOne(Integer id);
    void addCount (Integer id);
    void minusCount(Integer id);
    void addSPC(ShoppingCar SPC);
    List<ShoppingCar> selectAll(String openid);
    ShoppingCar selectById(Integer id);
}
