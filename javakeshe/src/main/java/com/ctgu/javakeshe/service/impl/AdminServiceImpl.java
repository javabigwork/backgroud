package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.AdminDao;
import com.ctgu.javakeshe.entity.Admin;
import com.ctgu.javakeshe.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }
}
