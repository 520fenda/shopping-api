package com.study.dao;

import com.study.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderDao {
    List<Order> getOrders();

    List<Order> getOrderByUid(Integer id);

    Order gerOrderAndOrderDetails(Integer id);
    void saveOrder(Order order);
}
