package com.study.entity;

import lombok.Data;

import java.util.List;

@Data
public class CartVO {

    private List<goodsVO> goods;
    private  Integer uid;
    private String totalPrice;
    private Integer aid;

}
