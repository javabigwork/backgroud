package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.dao.DetailDTODao;
import com.ctgu.javakeshe.entity.DetailDTO;

import java.util.List;

public interface DetailDTOService {
    List<DetailDTO> selectDetailDTO(Integer orderid);
    List<DetailDTO> selectByStatus(String openid,Integer status);
    List<DetailDTO> selectAll(String openid);
}
