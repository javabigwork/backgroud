package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.CollectDao;
import com.ctgu.javakeshe.entity.Collect;

import com.ctgu.javakeshe.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<Collect> selectAllByOpen_id(String openId) {
        return collectDao.selectAllByOpen_id(openId);
    }

    @Override
    public Collect addCollect(String openId, String isbn) {
        Map<String,String> collectMap=new HashMap<>();
        collectMap.put("openId",openId);
        collectMap.put("isbn",isbn);
        return collectDao.addCollect(collectMap);
    }

    @Override
    public void deleteCollect(int id) {
        collectDao.deleteCollect(id);
    }


}