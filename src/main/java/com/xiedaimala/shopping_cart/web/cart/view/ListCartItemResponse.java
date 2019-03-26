package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;

import java.util.List;

public class ListCartItemResponse {
    private List<CartItem> cartItems;

    public ListCartItemResponse() {

    }

    public ListCartItemResponse(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
