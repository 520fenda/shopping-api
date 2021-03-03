package com.study.service.impl;

import com.study.dao.OrderDao;
import com.study.entity.Order;
import com.study.service.OrderService;
import com.study.utill.getUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

    @Override
    public List<Order> getOrderByUid(Integer id) {
        return orderDao.getOrderByUid(id);
    }

    @Override
    public Order gerOrderAndOrderDetails(Integer id) {
        return orderDao.gerOrderAndOrderDetails(id);
    }

    @Override
    public void saveOrder(Order order) {
        orderDao.saveOrder(order);
    }
}
