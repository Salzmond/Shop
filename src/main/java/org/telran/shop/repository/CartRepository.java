package org.telran.shop.repository;

import org.telran.shop.model.Product;

import java.util.List;

public interface CartRepository {

    List<Product> showAll();

    void addToCart(Product product);

    void removeFromCart(Product product);
}