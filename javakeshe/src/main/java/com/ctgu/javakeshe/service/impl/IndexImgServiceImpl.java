package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.IndexImgDao;
import com.ctgu.javakeshe.entity.IndexImg;
import com.ctgu.javakeshe.service.IndexImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Linyuting
 * @date 2020-07-01 0:08
 * @company CTGU
 */
@Service

public class IndexImgServiceImpl implements IndexImgService {

    @Resource
    private IndexImgDao indexImgDao;
    @Override
    public List<IndexImg> selectAllByType(Integer type) {
        return indexImgDao.selectAllByType(type);
    }

    @Override
    public void deleteById(Integer id) {
        indexImgDao.deleteById(id);
    }

//    @Override
//    public void addIndexImg(String url, Integer type, String title) {
//        HashMap<String, Integer> indexImgMap=new HashMap<>();
////        indexImgMap.put("url",url);
//        indexImgMap.put("type",type);
//        indexImgMap.put("title",title);
//        return IndexImg.addIndexImg(indexImgMap);
//    }
}
