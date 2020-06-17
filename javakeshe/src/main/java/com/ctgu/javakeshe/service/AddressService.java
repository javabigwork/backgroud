package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> selectByOpenId(String openid);
    void insertAddress(Address adress);
    void deleteById(Integer id);
}
