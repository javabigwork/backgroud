package com.ctgu.javakeshe.entity;

public class ClassificationNUm {
    private String classificationName;
    private Integer classificationNum;

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public Integer getClassificationNum() {
        return classificationNum;
    }

    public void setClassificationNum(Integer classificationNum) {
        this.classificationNum = classificationNum;
    }

    public ClassificationNUm(String classificationName, Integer classificationNum) {
        this.classificationName = classificationName;
        this.classificationNum = classificationNum;
    }

    public ClassificationNUm() {
    }

    @Override
    public String toString() {
        return "ClassificationNUm{" +
                "classificationName='" + classificationName + '\'' +
                ", classificationNum=" + classificationNum +
                '}';
    }
}
