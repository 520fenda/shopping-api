package com.study.controller;

import com.study.entity.*;
import com.study.service.*;
import com.study.utill.ResponseUtil;
import com.study.utill.getUUID;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private CartService cartService;
    @ResponseBody
    @RequestMapping("/getOrders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @ResponseBody
    @GetMapping("/getOrderByUid")
    public List<Order> getOrderByUid(Integer uid) {
        return orderService.getOrderByUid(uid);
    }

    @ResponseBody
    @RequestMapping("/gerOrderAndOrderDetails")
    public Order gerOrderAndOrderDetails(Integer uid) {
        return orderService.gerOrderAndOrderDetails(uid);
    }


    @GetMapping("/saveOrder")
    public ResponseUtil saveOrder( Integer uid,String totalPrice,Integer gid,Integer gnum,Integer aid) {
        Order order=new Order();
        Integer orderNumber = getUUID.nextItemNo();
        order.setUserId(uid);
        order.setNumber(orderNumber+"");
        order.setTotalPrice(totalPrice);
        order.setCreateTime(new Date());
        order.setAddressId(aid);
         orderService.saveOrder(order);
         int oid=order.getId();
        Goods goods = goodsService.getGoodsById(gid);
            OrderDetails orderDetails=new OrderDetails();
            orderDetails.setOrderId(oid);
            orderDetails.setGoodsId(goods.getId());
            orderDetails.setGoodsName(goods.getName());
            orderDetails.setGoodsNumber(gnum);
            orderDetails.setGoodsName(goods.getName());
            orderDetails.setGoodsImag(goods.getImage());
            orderDetails.setGoodsPrice(goods.getPrice());
            orderDetailsService.saveOrderDetail(orderDetails);

            return ResponseUtil.successMsg("保存订单成功");
    }

    @PostMapping("/saveOrder2")
    public ResponseUtil saveOrder2(@RequestBody CartVO cartVO) {
        System.out.println(cartVO);
        Order order=new Order();
        order.setUserId(cartVO.getUid());
        order.setTotalPrice(cartVO.getTotalPrice());
        Integer orderNumber = getUUID.nextItemNo();
        order.setNumber(orderNumber+"");
        order.setCreateTime(new Date());
        order.setAddressId(cartVO.getAid());
        orderService.saveOrder(order);
        int oid=order.getId();

        List<goodsVO> goods = cartVO.getGoods();

        for (goodsVO good : goods) {
            OrderDetails orderDetails=new OrderDetails();
            Goods goodsById = goodsService.getGoodsById(good.getGid());
            orderDetails.setOrderId(oid);
            orderDetails.setGoodsId(good.getGid());
            orderDetails.setGoodsName(goodsById.getName());
            orderDetails.setGoodsNumber(good.getNum());
            orderDetails.setGoodsPrice(goodsById.getPrice());
            orderDetails.setGoodsImag(goodsById.getImage());
            orderDetailsService.saveOrderDetail(orderDetails);
            cartService.deleteCart(cartVO.getUid(),good.getGid() );
        }
        return ResponseUtil.successMsg("保存订单成功");
    }
}
