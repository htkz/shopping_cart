package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;

public class GetCartItemResponse {
    private CartItem cartItem;

    public GetCartItemResponse() {

    }

    public GetCartItemResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
