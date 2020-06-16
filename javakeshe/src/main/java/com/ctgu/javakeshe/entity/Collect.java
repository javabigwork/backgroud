package com.ctgu.javakeshe.entity;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/15 0:31
 */
public class Collect {
    private int id;
    private String open_id;
    private String isbn;

    public Collect() {
    }

    public Collect(int id, String open_id, String isbn) {
        this.id = id;
        this.open_id = open_id;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", open_id=" + open_id +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
