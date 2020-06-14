package com.ctgu.javakeshe.entity;


import java.util.List;

public class Book {
    private String isbn;
    private String bookTitle;
    private String bookName;
    private String bookAuthor;
    private double bookOldPrice;
    private double bookNewPrice;
    private double bookDiscount;
    private Integer bookCategoryId;
    private Integer bookStock;
    private String bookContent;
    private Integer bookSalesVolume;
    private String bookImgPath;
    private List<BookImg> bookImgList;

    public List<BookImg> getBookImgList() {
        return bookImgList;
    }

    public void setBookImgList(List<BookImg> bookImgList) {
        this.bookImgList = bookImgList;
    }

    public String getBookImgPath() {
        return bookImgPath;
    }

    public void setBookImgPath(String bookImgPath) {
        this.bookImgPath = bookImgPath;
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

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookOldPrice() {
        return bookOldPrice;
    }

    public void setBookOldPrice(double bookOldPrice) {
        this.bookOldPrice = bookOldPrice;
    }

    public double getBookNewPrice() {
        return bookNewPrice;
    }

    public void setBookNewPrice(double bookNewPrice) {
        this.bookNewPrice = bookNewPrice;
    }

    public double getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(double bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public Integer getBookStock() {
        return bookStock;
    }

    public void setBookStock(Integer bookStock) {
        this.bookStock = bookStock;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public Integer getBookSalesVolume() {
        return bookSalesVolume;
    }

    public void setBookSalesVolume(Integer bookSalesVolume) {
        this.bookSalesVolume = bookSalesVolume;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookOldPrice=" + bookOldPrice +
                ", bookNewPrice=" + bookNewPrice +
                ", bookDiscount=" + bookDiscount +
                ", bookCategoryId=" + bookCategoryId +
                ", bookStock=" + bookStock +
                ", bookContent='" + bookContent + '\'' +
                ", bookSalesVolume=" + bookSalesVolume +
                ", bookImgPath='" + bookImgPath + '\'' +
                ", bookImgList=" + bookImgList +
                '}';
    }

    public Book(String isbn, String bookTitle, String bookName, String bookAuthor, double bookOldPrice, double bookNewPrice, double bookDiscount, Integer bookCategoryId, Integer bookStock, String bookContent, Integer bookSalesVolume, String bookImgPath, List<BookImg> bookImgList) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookOldPrice = bookOldPrice;
        this.bookNewPrice = bookNewPrice;
        this.bookDiscount = bookDiscount;
        this.bookCategoryId = bookCategoryId;
        this.bookStock = bookStock;
        this.bookContent = bookContent;
        this.bookSalesVolume = bookSalesVolume;
        this.bookImgPath = bookImgPath;
        this.bookImgList = bookImgList;
    }

    public Book() {
    }
}
