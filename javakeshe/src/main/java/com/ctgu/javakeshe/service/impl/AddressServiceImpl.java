package com.ctgu.javakeshe.service.impl;


import com.ctgu.javakeshe.dao.AddressDao;
import com.ctgu.javakeshe.entity.Address;
import com.ctgu.javakeshe.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;

    @Override
    public List<Address> selectByOpenId(String openid){
        return addressDao.selectByOpenId(openid);
    }
    @Override
    public void insertAddress(Address adress){
        addressDao.insertAddress(adress);
    }
}
