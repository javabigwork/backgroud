package com.ctgu.javakeshe.entity;

public class BookImg {
    private Integer id;
    private String isbn;
    private String url;
    private Integer sort;

    public BookImg() {
    }

    public BookImg(Integer id, String isbn, String url, Integer sort) {
        this.id = id;
        this.isbn = isbn;
        this.url = url;
        this.sort = sort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "BookImg{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", url='" + url + '\'' +
                ", sort=" + sort +
                '}';
    }
}
