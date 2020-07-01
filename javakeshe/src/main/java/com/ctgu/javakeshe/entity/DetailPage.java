package com.ctgu.javakeshe.entity;

import java.util.List;

public class DetailPage {
    private Integer orderid;
    private Double money;
    private List<DetailDTO> detailDTO;
    public DetailPage(){};
    public Address address;

    @Override
    public String toString() {
        return "DetailPage{" +
                "orderid=" + orderid +
                ", money=" + money +
                ", detailDTO=" + detailDTO +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public Double getMoney() {
        return money;
    }

    public List<DetailDTO> getDetailDTO() {
        return detailDTO;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setDetailDTO(List<DetailDTO> detailDTO) {
        this.detailDTO = detailDTO;
    }
}
