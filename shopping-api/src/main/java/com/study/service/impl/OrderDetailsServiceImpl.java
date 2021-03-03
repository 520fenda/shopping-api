package com.study.service.impl;

import com.study.dao.GoodsDao;
import com.study.dao.OrderDetailsDao;
import com.study.entity.Goods;
import com.study.entity.OrderDetails;
import com.study.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsDao orderDetailsDao;
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<OrderDetails> getOrderDetails() {
        return orderDetailsDao.getOrderDetails();
    }

    @Override
    public OrderDetails getOrderDetailsById(Integer id) {
        return orderDetailsDao.getOrderDetailsById(id);
    }

    @Override
    public List<OrderDetails> getOrderDetailsByOid(Integer id) {
        return orderDetailsDao.getOrderDetailsByOid(id);
    }

    @Override
    public void saveOrderDetail(OrderDetails orderDetails) {
        orderDetailsDao.saveOrderDetail(orderDetails);
    }


    @Override
    public void changeoid(OrderDetails orderDetails) {
        orderDetailsDao.changeoid(orderDetails);
    }

    @Override
    public void updateod(OrderDetails orderDetails) {
        orderDetailsDao.updateod(orderDetails);
    }
}
