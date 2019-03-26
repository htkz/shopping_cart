package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;

public class CreateCartItemResponse {
    private CartItem cartItem;

    public CreateCartItemResponse() {

    }

    public CreateCartItemResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
