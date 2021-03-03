package com.study.service;

import com.study.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    List<Order> getOrderByUid(Integer id);
    //collection
    Order gerOrderAndOrderDetails(Integer id);
    @Transactional
    void saveOrder(Order order);

}
