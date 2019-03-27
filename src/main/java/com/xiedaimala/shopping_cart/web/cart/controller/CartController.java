package com.xiedaimala.shopping_cart.web.cart.controller;

import com.xiedaimala.shopping_cart.web.cart.model.CartItem;
import com.xiedaimala.shopping_cart.web.cart.model.CartItemDao;
import com.xiedaimala.shopping_cart.web.cart.view.*;
import com.xiedaimala.shopping_cart.web.product.model.Product;
import com.xiedaimala.shopping_cart.web.product.model.ProductDao;
import com.xiedaimala.shopping_cart.web.user.model.User;
import com.xiedaimala.shopping_cart.web.user.model.UserDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    private UserDao userDao;
    private ProductDao productDao;
    private CartItemDao cartItemDao;

    public CartController(UserDao userDao, ProductDao productDao, CartItemDao cartItemDao) {
        this.userDao = userDao;
        this.productDao = productDao;
        this.cartItemDao = cartItemDao;
    }

    @GetMapping("/cartItems")
    public ResponseEntity<ListCartItemResponse> listCartItems() {
        List<CartItem> cartItems = cartItemDao.findAll();
        return new ResponseEntity<>(new ListCartItemResponse(cartItems), HttpStatus.OK);
    }

    @GetMapping("/cartItems/{cartItemId}")
    public ResponseEntity<GetCartItemResponse> getCartItem(@PathVariable long cartItemId) {
        CartItem cartItem = cartItemDao.getById(cartItemId);

        if (cartItem == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(new GetCartItemResponse(cartItem), HttpStatus.OK);
        }
    }

    @PostMapping("/cartItems")
    public ResponseEntity<CreateCartItemResponse> createCartItem(@RequestBody CreateCartItemRequest createCartItemRequest) {
        User user = userDao.getById(createCartItemRequest.getUserId());
        Product product = productDao.getById(createCartItemRequest.getProductId());
        long quantity = createCartItemRequest.getQuantity();
        CartItem cartItem = cartItemDao.save(new CartItem(user, product, quantity));
        return new ResponseEntity<>(new CreateCartItemResponse(cartItem), HttpStatus.OK);
    }

    @PutMapping("/cartItems/{cartItemId}")
    public ResponseEntity<UpdateCartItemResponse> updateCartItem(@PathVariable long cartItemId, UpdateCartItemRequest updateCartItemRequest) {
        CartItem cartItem = cartItemDao.getById(cartItemId);
        if (cartItem == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cartItem.setQuantity(updateCartItemRequest.getQuantity());
        cartItem = cartItemDao.save(cartItem);
        return new ResponseEntity<>(new UpdateCartItemResponse(cartItem), HttpStatus.OK);
    }

    @DeleteMapping("/cartItems/{cartItemId}")
    public ResponseEntity deleteCartItem(@PathVariable long cartItemId) {
        CartItem cartItem = cartItemDao.getById(cartItemId);
        if (cartItem == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        cartItemDao.delete(cartItem);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
