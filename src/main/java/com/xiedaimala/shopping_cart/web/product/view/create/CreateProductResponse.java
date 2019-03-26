package com.xiedaimala.shopping_cart.web.product.view.create;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.user.view.CreateUserResponse;

public class CreateProductResponse {
    private Product product;

    public CreateProductResponse() {

    }

    public CreateProductResponse(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {

        return product;
    }
}
