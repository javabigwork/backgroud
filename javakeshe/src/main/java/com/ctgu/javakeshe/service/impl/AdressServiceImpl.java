package com.ctgu.javakeshe.service.impl;


import com.ctgu.javakeshe.dao.AdressDao;
import com.ctgu.javakeshe.entity.Adress;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdressServiceImpl {
    @Resource
    private AdressDao adressDao;

    public List<Adress> selectByOpenId(String openid){
        return adressDao.selectByOpenId(openid);
    }
    public void insertAdress(Adress adress){
        adressDao.insertAdress(adress);
    }
}
