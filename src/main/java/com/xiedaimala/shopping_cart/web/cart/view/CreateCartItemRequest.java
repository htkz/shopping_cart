package com.xiedaimala.shopping_cart.web.cart.view;

import com.xiedaimala.shopping_cart.web.product.view.create.CreateProductRequest;

public class CreateCartItemRequest {
    private long userId;
    private long productId;
    private long quantity;

    public CreateCartItemRequest() {

    }

    public CreateCartItemRequest(long userId, long productId, long quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getUserId() {

        return userId;
    }

    public long getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }
}
