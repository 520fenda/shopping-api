package com.study.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.dao.GoodsDao;
import com.study.entity.Goods;
import com.study.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> getGoods() {
        return goodsDao.getGoods();
    }

    @Override
    public Goods getGoodsById(Integer id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public PageInfo<Goods> findPageAll(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Goods> all = goodsDao.getGoods();
        PageInfo<Goods> info = new PageInfo<>(all);
        return info;

    }




}
