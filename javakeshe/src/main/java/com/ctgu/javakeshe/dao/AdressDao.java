package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Adress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdressDao {
    List<Adress> selectByOpenId(String openid);
    void insertAdress(Adress adress);
}
