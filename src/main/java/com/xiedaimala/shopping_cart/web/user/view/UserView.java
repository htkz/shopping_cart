package com.xiedaimala.shopping_cart.web.user.view;

public class UserView {
    private long id;
    private String name;

    public UserView() {

    }

    public UserView(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
