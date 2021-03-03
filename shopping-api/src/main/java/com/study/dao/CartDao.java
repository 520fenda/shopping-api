package com.study.dao;

import com.study.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {
    List<Cart> getCartByUid(Integer id);
    void  addCart(Cart cart);
    Cart getCartById(Integer id);

    Cart existcart(@Param("userId") Integer uid, @Param("goodsId") Integer gid);
    void updateCartNum(Cart cart);
    void deleteCart(@Param("userId") Integer uid, @Param("goodsId") Integer gid);

}
