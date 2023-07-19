package org.telran.shop.repository;

import org.springframework.stereotype.Repository;
import org.telran.shop.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements CartRepository {

    private Map<Product, Integer> orders = new HashMap<>();

    @Override
    public List<Product> showAll() {
        return new ArrayList<>(orders.keySet());
    }

    @Override
    public void addToCart(Product product) {
        int value = orders.getOrDefault(product, 0);
        orders.put(product, value + 1);
    }

    @Override
    public void removeFromCart(Product product) {
        int value = orders.getOrDefault(product, 0);
        orders.remove(product);
    }
}