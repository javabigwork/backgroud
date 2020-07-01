package com.ctgu.javakeshe.entity;

import lombok.Data;

/**
 * @author Linyuting
 * @date 2020-07-01 0:03
 * @company CTGU
 */
@Data
public class IndexImg {
    private Integer id;
    private String url;
    private Integer type;
    private String title;

    public IndexImg() {
    }

    public IndexImg(Integer id, String url, Integer type, String title) {
        this.id = id;
        this.url = url;
        this.type = type;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "IndexImg{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type=" + type +
                ", title='" + title + '\'' +
                '}';
    }
}
