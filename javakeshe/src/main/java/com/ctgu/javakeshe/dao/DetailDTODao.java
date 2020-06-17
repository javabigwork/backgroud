package com.ctgu.javakeshe.dao;


import com.ctgu.javakeshe.entity.DetailDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DetailDTODao {
    List<DetailDTO> selectDetailDTO(Integer orderid);

    List<DetailDTO> selectByStatus(@Param("openid")String openid,@Param("status")Integer status);

    List<DetailDTO> selectAll(String openid);
}
