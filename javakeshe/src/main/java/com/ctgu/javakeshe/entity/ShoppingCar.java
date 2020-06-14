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
    private Integer openid;
    private Double price;

    public ShoppingCar(){}

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", count=" + count +
                ", openid=" + openid +
                ", price=" + price +
                '}';
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

    public void setOpenid(Integer openid) {
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

    public Integer getOpenid() {
        return openid;
    }

    public Double getPrice() {
        return price;
    }

    public ShoppingCar(Integer id, String isbn, Integer count, Integer openid, Double price) {
        this.id = id;
        this.isbn = isbn;
        this.count = count;
        this.openid = openid;
        this.price = price;
    }
}
