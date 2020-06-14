package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Adress;

import java.util.List;

public interface AdressService {
    List<Adress> selectByOpenId(String openid);
    void insertAdress(Adress adress);

}
