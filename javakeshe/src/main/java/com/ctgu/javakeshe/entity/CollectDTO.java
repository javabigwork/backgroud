package com.ctgu.javakeshe.entity;

/**
 * @author 朱颖
 * @version 0.0
 * @date 2020/6/17 1:22
 */
public class CollectDTO {
    private Integer id;
    private String date;
    private String isbn;
    private String bookTitle;
    private String bookName;
    private String url;
    private double bookPrice;

    public CollectDTO( ) {
    }

    public CollectDTO(Integer id, String date, String isbn, String bookTitle, String bookName, String url, double bookPrice) {
        this.id = id;
        this.date = date;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.bookName = bookName;
        this.url = url;
        this.bookPrice = bookPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "CollectDTO{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookName='" + bookName + '\'' +
                ", url='" + url + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
