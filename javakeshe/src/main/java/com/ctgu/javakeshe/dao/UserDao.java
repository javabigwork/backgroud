package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User selectById(@Param("openId") String openId);

    int insertUser(User user);

    void updateUser(User user);
}
