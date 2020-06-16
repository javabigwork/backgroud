package com.ctgu.javakeshe.service.impl;

import com.ctgu.javakeshe.dao.ClassificationDao;
import com.ctgu.javakeshe.entity.Classification;
import com.ctgu.javakeshe.entity.ClassificationNUm;
import com.ctgu.javakeshe.service.ClassificationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassificationServiceImpl implements ClassificationService {

    @Resource
    private ClassificationDao classificationDao;


    @Override
    public List<Classification> selectclassification() {
        return classificationDao.selectclassification();
    }

    @Override
    public Classification addclassification(Classification classification) {
         classificationDao.addclassification(classification);
         return classification;
    }

    @Override
    public Classification updateclassification(Classification classification) {
        classificationDao.updateclassification(classification);
        return classification;
    }

    @Override
    public void deleteclassification(Integer classificationId) {
        classificationDao.deleteclassification(classificationId);
    }

    @Override
    public List<ClassificationNUm> selectnumofclassification() {
        return classificationDao.selectnumofclassification();
    }

    @Override
    public Classification selectoneclassification(Integer classificationId) {
        return classificationDao.selectoneclassification(classificationId);
    }
}
