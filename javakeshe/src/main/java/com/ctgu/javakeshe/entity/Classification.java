package com.ctgu.javakeshe.entity;

public class Classification {
    private Integer classificationId;
    private String classificationName;

    public Classification(Integer classificationId, String classificationName) {
        this.classificationId = classificationId;
        this.classificationName = classificationName;
    }

    public Classification() {
    }

    @Override
    public String toString() {
        return "Classification{" +
                "classificationId=" + classificationId +
                ", classificationName='" + classificationName + '\'' +
                '}';
    }

    public Integer getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Integer classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }
}
