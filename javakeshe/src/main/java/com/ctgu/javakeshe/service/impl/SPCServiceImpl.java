package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.SPCDao;
import com.ctgu.javakeshe.entity.ShoppingCar;
import com.ctgu.javakeshe.service.SPCService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SPCServiceImpl implements SPCService {
    @Resource
    private SPCDao spcDao;
    @Override
    public void deleteAll(String openid){
        spcDao.deleteAll(openid);
    }
    @Override
    public void deleteOne(Integer id){
        spcDao.deleteOne(id);
    }
    @Override
    public void addCount (Integer id){
        spcDao.addCount(id);
    }
    @Override
    public void minusCount(Integer id){
        spcDao.minusCount(id);
    }
    @Override
    public void addSPC(ShoppingCar SPC){
        spcDao.addSPC(SPC);
    }
    @Override
    public List<ShoppingCar> selectAll(String openid){
        return spcDao.selectAll(openid);
    }
    @Override
    public ShoppingCar selectById(Integer id){
        return spcDao.selectById(id);
    }

    @Override
    public List<ShoppingCar> selectShoppingCar(String openId) {
        return spcDao.selectShoppingCar(openId);
    }

}
