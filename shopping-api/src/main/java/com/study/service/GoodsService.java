package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoods();
    Goods getGoodsById(Integer id);
    PageInfo<Goods> findPageAll(int page, int pageSize);


}
