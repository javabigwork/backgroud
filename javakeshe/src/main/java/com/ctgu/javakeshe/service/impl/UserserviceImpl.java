package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.UserDao;
import com.ctgu.javakeshe.entity.User;
import com.ctgu.javakeshe.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserserviceImpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public void creatUser(User user) {
        user.setNickName("Tourist");
        user.setLastLoginTime(new Date());
        userDao.insertUser(user);
    }

    @Override
    public User findById(String openId) {
        return userDao.selectById(openId);
    }

    @Override
    public void saveUser(User user) {
        userDao.updateUser(user);
    }


}
