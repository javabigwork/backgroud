package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.User;

public interface UserService {
    

    void creatUser(User user);

    User findById(String openId);

    void saveUser(User user);
}
