package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {
    List<Address> selectByOpenId(String openid);
    void insertAddress(Address adress);
    void deleteById(Integer id);
}