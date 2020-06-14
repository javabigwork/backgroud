package com.ctgu.javakeshe.entity;



//  `id` int(10) NOT NULL AUTO_INCREMENT,
//          `consignee` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//          `mobile` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//          `provinceName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//          `cityName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//          `countyName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//          `detail_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,


public class Address {
    private Integer id;
    private String consignee;
    private String province;
    private String city;
    private String country;
    private String detail;
    private String openid;
    private String phone;
    public Address(){}

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", consignee='" + consignee + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", detail='" + detail + '\'' +
                ", openid='" + openid + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDetail() {
        return detail;
    }

    public String getOpenid() {
        return openid;
    }

    public String getPhone() {
        return phone;
    }

    public Address(Integer id, String consignee, String province, String city, String country, String detail, String openid, String phone) {
        this.id = id;
        this.consignee = consignee;
        this.province = province;
        this.city = city;
        this.country = country;
        this.detail = detail;
        this.openid = openid;
        this.phone = phone;
    }
}
