package com.xiedaimala.shopping_cart.web.product.view;

import com.xiedaimala.shopping_cart.web.product.model.Product;

public class UpdateProductResponse {

    private Product product;

    public UpdateProductResponse(Product product) {
        this.product = product;
    }

    public UpdateProductResponse() {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}