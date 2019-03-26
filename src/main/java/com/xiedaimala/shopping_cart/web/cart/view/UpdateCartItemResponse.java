package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;

public class UpdateCartItemResponse {
    private CartItem cartItem;

    public UpdateCartItemResponse() {

    }

    public UpdateCartItemResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {

        return cartItem;
    }
}
