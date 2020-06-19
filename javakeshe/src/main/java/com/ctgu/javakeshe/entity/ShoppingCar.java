package com.ctgu.javakeshe.entity;





//
//CREATE TABLE `shopping_car`  (
//        `id` int(10) NOT NULL AUTO_INCREMENT,
//        `isbn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `count` int(10) NULL DEFAULT NULL,
//        `open_id` int(10) NULL DEFAULT NULL,
//        PRIMARY KEY (`id`) USING BTREE
//        ) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;



public class ShoppingCar {

    private Integer id;
    private String isbn;
    private Integer count;
    private String openid;
    private Double price;
    private String bookName;
    private String bookTitle;
    private String bookImgPath;
    private Integer isSelect;


    public Integer getSelect() {
        return isSelect;
    }

    public void setSelect(Integer select) {
        isSelect = select;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookImgPath() {
        return bookImgPath;
    }

    public void setBookImgPath(String bookImgPath) {
        this.bookImgPath = bookImgPath;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getCount() {
        return count;
    }

    public String getOpenid() {
        return openid;
    }

    public Double getPrice() {
        return price;
    }

<<<<<<< HEAD
    public ShoppingCar(Integer id, String isbn, Integer count, String openid, Double price) {
=======
    public ShoppingCar(Integer id, String isbn, Integer count, String openid, Double price, String bookName, String bookTitle, String bookImgPath, Integer isSelect) {
>>>>>>> lc
        this.id = id;
        this.isbn = isbn;
        this.count = count;
        this.openid = openid;
        this.price = price;
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.bookImgPath = bookImgPath;
        this.isSelect = isSelect;
    }

    public ShoppingCar() {
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", count=" + count +
                ", openid='" + openid + '\'' +
                ", price=" + price +
                ", bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookImgPath='" + bookImgPath + '\'' +
                ", isSelect=" + isSelect +
                '}';
    }
}
