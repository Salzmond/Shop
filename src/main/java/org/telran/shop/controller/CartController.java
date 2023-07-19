package org.telran.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.model.Product;
import org.telran.shop.service.CartService;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Product> showAll() {
        return  cartService.showAll();
    }

    @PostMapping
    public void addToCart(@RequestBody Product product) {
        cartService.addToCart(product);
    }

    @DeleteMapping
    public void deleteFromCart(@RequestBody Product product) {
        cartService.removeFromCart(product);
    }
}