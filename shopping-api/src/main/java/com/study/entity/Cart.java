package com.study.entity;

import lombok.Data;

@Data
public class Cart {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsNumber;
    private String goodsPrice;
    private String goodsImag;
    private Integer flage;
}
