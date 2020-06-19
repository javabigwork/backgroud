package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Admin;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminDao {

    Admin login(Admin admin);
}
