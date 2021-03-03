package com.study.service;

import com.study.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartService {
    List<Cart> getCartByUid(Integer id);
    void  addCart(Cart cart);
    Cart getCartById(Integer id);

    Cart existcart(Integer uid, Integer gid);
    void updateCartNum(Cart cart);
    void deleteCart(Integer uid, Integer gid);
}
