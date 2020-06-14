package com.ctgu.javakeshe.entity;

//DROP TABLE IF EXISTS `order_detail`;
//        CREATE TABLE `order_detail`  (
//        `id` int(10) NOT NULL AUTO_INCREMENT,
//        `isbn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `open_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `order_id` int(10) NULL DEFAULT NULL,
//        `order_num` int(10) NULL DEFAULT NULL,
//        PRIMARY KEY (`id`) USING BTREE
//        ) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//


public class OrderDetail {
private Integer id;
private String isbn;
private String openid;
private Integer orderid;
private Integer orderNum;

}
