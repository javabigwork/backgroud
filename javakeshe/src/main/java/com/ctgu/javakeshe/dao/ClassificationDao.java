package com.ctgu.javakeshe.dao;

import com.ctgu.javakeshe.entity.Classification;
import com.ctgu.javakeshe.entity.ClassificationNUm;

import java.util.List;

public interface ClassificationDao {
    List<Classification> selectclassification();

    void addclassification(Classification classification);

    void updateclassification(Classification classification);

    void deleteclassification(Integer classificationId);

    List<ClassificationNUm> selectnumofclassification();

    Classification selectoneclassification(Integer classificationId);
}
