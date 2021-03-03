package com.study.dao;


import com.study.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsDao {
    List<OrderDetails> getOrderDetails();
     OrderDetails getOrderDetailsById(Integer id);
    List<OrderDetails> getOrderDetailsByOid(Integer id);
    void saveOrderDetail(OrderDetails orderDetails);
    void changeoid(OrderDetails orderDetails);
    void  updateod(OrderDetails orderDetails);
}
