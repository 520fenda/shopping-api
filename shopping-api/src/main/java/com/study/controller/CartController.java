package com.study.controller;

import com.study.entity.Cart;
import com.study.entity.Goods;
import com.study.entity.addCartVO;
import com.study.service.CartService;
import com.study.service.GoodsService;
import com.study.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private GoodsService goodsService;

    @ResponseBody
    @RequestMapping("/getCartByUid")
    public List<Cart> getCartByUid(Integer id) {
        return cartService.getCartByUid(id);
    }


    @PostMapping("/addCart")
    @ResponseBody
    public ResponseUtil addCart(@RequestBody addCartVO addCartVO) {
        Cart existcart = cartService.existcart(addCartVO.getUid(), addCartVO.getGid());
        if (existcart == null || existcart != null && existcart.getFlage() == 1) {
            Goods goods = goodsService.getGoodsById(addCartVO.getGid());
            Cart cart = new Cart();
            cart.setUserId(addCartVO.getUid());
            cart.setGoodsId(goods.getId());
            cart.setGoodsName(goods.getName());
            cart.setGoodsNumber(addCartVO.getNum());
            cart.setGoodsPrice(goods.getPrice());
            cart.setGoodsImag(goods.getImage());
            cart.setFlage(0);
            cartService.addCart(cart);
        } else {
            Integer beforenumber = existcart.getGoodsNumber();
            existcart.setGoodsNumber(beforenumber + addCartVO.getNum());
            cartService.updateCartNum(existcart);
        }
        return ResponseUtil.successMsg("加入购物车成功");

    }

    @ResponseBody
    @RequestMapping("/getCartById")
    public Cart getCartById(Integer id) {
        return cartService.getCartById(id);
    }

//    @GetMapping("/deleCart")
//    public void deleCart(Integer uid,Integer gid){
//        cartService.deleCart(uid, gid);
//
//    }

}
