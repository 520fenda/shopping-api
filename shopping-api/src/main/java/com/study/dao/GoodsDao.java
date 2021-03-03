package com.study.dao;

import com.study.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
   List<Goods> getGoods();
    Goods getGoodsById(Integer id);



}
