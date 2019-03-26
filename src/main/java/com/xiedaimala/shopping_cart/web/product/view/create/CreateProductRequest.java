package com.xiedaimala.shopping_cart.web.product.view.create;

import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.user.view.CreateUserRequest;

public class CreateProductRequest {
    private String name;
    private String description;
    private double price;

    public CreateProductRequest() {

    }

    public CreateProductRequest(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
