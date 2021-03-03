package com.study.service;


import com.study.entity.OrderDetails;

import java.util.List;
import java.util.Map;

public interface OrderDetailsService {

    List<OrderDetails> getOrderDetails();
    OrderDetails getOrderDetailsById(Integer id);
    List<OrderDetails> getOrderDetailsByOid(Integer id);
    void saveOrderDetail(OrderDetails orderDetails);
//    void saveOrderDetail2( Map<Integer,Integer> map);
    void changeoid(OrderDetails orderDetails);
    void  updateod(OrderDetails orderDetails);
}
