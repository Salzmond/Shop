package org.telran.shop.service;

import org.telran.shop.model.Product;

import java.util.List;

public interface CartService {

    List<Product> showAll();

    void addToCart(Product product);

    void removeFromCart(Product product);
}