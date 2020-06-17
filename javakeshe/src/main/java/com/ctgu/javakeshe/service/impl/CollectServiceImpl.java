package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.CollectDao;
import com.ctgu.javakeshe.entity.Collect;

import com.ctgu.javakeshe.entity.CollectDTO;
import com.ctgu.javakeshe.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/14 21:22
 */
@Service
public class CollectServiceImpl implements CollectService {
    @Resource
    private CollectDao collectDao;
    @Override
    public List<CollectDTO> selectAllByOpen_id(String openId) {
        return collectDao.selectAllByOpen_id(openId);
    }

    @Override
    public void addCollect(String openId, String isbn) {
            if(collectDao.selectIfCollect(openId,isbn)==null){
                //获取当前日期和时间存储到now中
                Timestamp time = new Timestamp(new java.util.Date().getTime());
                String date = time.toString().substring(0, 19);
                collectDao.addCollect(openId,isbn,date);
            }
    }

    @Override
    public void deleteCollect(int id) {
        collectDao.deleteCollect(id);
    }


}
