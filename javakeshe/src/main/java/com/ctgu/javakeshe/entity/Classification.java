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
}
