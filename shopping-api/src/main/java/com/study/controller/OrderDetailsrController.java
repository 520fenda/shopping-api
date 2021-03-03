package com.study.controller;

import com.study.entity.CartVO;
import com.study.entity.Goods;
import com.study.entity.OrderDetails;
import com.study.service.GoodsService;
import com.study.service.OrderDetailsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/orderdetails")
public class OrderDetailsrController {
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private GoodsService goodsService;
    @ResponseBody
    @RequestMapping("/getOrderDetails")
    public List<OrderDetails> getOrderDetails() {
        return orderDetailsService.getOrderDetails();
    }
    @ResponseBody
    @RequestMapping("/getOrderDetailsById")
    public OrderDetails getOrderDetailsById(Integer id) {
        return orderDetailsService.getOrderDetailsById(id);
    }

    @ResponseBody
    @GetMapping("/getOrderDetailsByOid")
    public List<OrderDetails> getOrderDetailsByOid(Integer oid) {
        return orderDetailsService.getOrderDetailsByOid(oid);
    }



//    @GetMapping("/saveod2")
//    public void  saveod2( CartVO cartVO){
//        Goods goods = goodsService.getGoodsById(cartVO.getGid());
//        OrderDetails orderDetails=new OrderDetails();
//        orderDetails.setGoodsId(goods.getId());
//        orderDetails.setGoodsName(goods.getName());
//        orderDetails.setGoodsNumber(cartVO.getGnum());
//        orderDetails.setGoodsPrice(goods.getPrice());
//        orderDetails.setGoodsImag(goods.getImage());
//        orderDetailsService.saveOrderDetail(orderDetails);


//    }



}
