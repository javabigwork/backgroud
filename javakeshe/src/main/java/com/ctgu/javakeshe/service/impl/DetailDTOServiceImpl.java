package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.DetailDTODao;
import com.ctgu.javakeshe.entity.DetailDTO;
import com.ctgu.javakeshe.service.DetailDTOService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DetailDTOServiceImpl implements DetailDTOService {
    @Resource
    private DetailDTODao detailDTODao;

    @Override
    public List<DetailDTO> selectDetailDTO(Integer orderid){
        return detailDTODao.selectDetailDTO(orderid);
    }

    @Override
    public List<DetailDTO> selectByStatus(String openid, Integer status){
        return detailDTODao.selectByStatus(openid,status);
    }

    @Override
    public List<DetailDTO> selectAll(String openid){
        return detailDTODao.selectAll(openid);
    }
}
