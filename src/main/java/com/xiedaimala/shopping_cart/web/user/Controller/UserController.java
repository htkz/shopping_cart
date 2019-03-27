package com.xiedaimala.shopping_cart.web.user.Controller;

import com.xiedaimala.shopping_cart.web.user.model.User;
import com.xiedaimala.shopping_cart.web.user.model.UserDao;
import com.xiedaimala.shopping_cart.web.user.view.CreateUserRequest;
import com.xiedaimala.shopping_cart.web.user.view.CreateUserResponse;
import com.xiedaimala.shopping_cart.web.user.view.ListUserResponse;
import com.xiedaimala.shopping_cart.web.user.view.UserView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/users")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        User user = new User(createUserRequest.getUsername(), createUserRequest.getPassword());
        User newUser = userDao.save(user);
        UserView userView = new UserView(newUser.getId(), newUser.getName());
        return new ResponseEntity<>(new CreateUserResponse(userView), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<ListUserResponse> listUsers() {
        List<User> users = userDao.findAll();
        return new ResponseEntity<>(new ListUserResponse(users), HttpStatus.OK);
    }
}
