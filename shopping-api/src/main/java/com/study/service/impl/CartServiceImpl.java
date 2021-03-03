package com.study.service.impl;

import com.study.dao.CartDao;
import com.study.entity.Cart;
import com.study.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;
    @Override
    public List<Cart> getCartByUid(Integer id) {
        return cartDao.getCartByUid(id);
    }

    @Override
    public void addCart(Cart cart) {
            cartDao.addCart(cart);
    }

    @Override
    public Cart getCartById(Integer id) {
        return cartDao.getCartById(id);
    }



    @Override
    public Cart existcart(Integer uid, Integer gid) {
        return cartDao.existcart(uid,gid );
    }

    @Override
    public void updateCartNum(Cart cart) {
        cartDao.updateCartNum(cart);
    }

    @Override
    public void deleteCart(Integer uid, Integer gid) {
        cartDao.deleteCart(uid,gid );
    }
}
