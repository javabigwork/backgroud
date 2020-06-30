package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.IndexImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Linyuting
 * @date 2020-07-01 0:03
 * @company CTGU
 */
public interface IndexImgDao {
    List<IndexImg> selectAllByType(@Param("type") Integer type);

    void deleteById(Integer id);
}
