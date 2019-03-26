package com.xiedaimala.shopping_cart.web.cart.model;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemDao {
    CartItem getById(long id);

    List<CartItem> findAll();

    CartItem save(CartItem cartItem);

    void delete(CartItem cartItem);
}
