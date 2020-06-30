package com.ctgu.javakeshe.service;

import com.ctgu.javakeshe.entity.Classification;
import com.ctgu.javakeshe.entity.ClassificationNUm;

import java.util.List;

public interface ClassificationService {
    List<Classification> selectclassification();

    Classification addclassification(Classification classification);

    Classification updateclassification(Classification classification);

    void deleteclassification(Integer classificationId);

    List<ClassificationNUm> selectnumofclassification();

    Classification selectoneclassification(Integer classificationId);
}
