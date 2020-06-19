package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.ShoppingCar;

import java.util.List;

public interface SPCService {
    void deleteAll(String opendid);
    void deleteOne(Integer id);
    void addCount (Integer id);
    void minusCount(Integer id);
    void addSPC(ShoppingCar SPC);
    List<ShoppingCar> selectAll(String openid);
    ShoppingCar selectById(Integer id);

    List<ShoppingCar> selectShoppingCar(String openId);
}
