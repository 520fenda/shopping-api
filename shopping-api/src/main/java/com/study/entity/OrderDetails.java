package com.study.entity;

import lombok.Data;

@Data
public class OrderDetails {
    private Integer id;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsNumber;
    private String goodsPrice;
    private String goodsImag;



}
