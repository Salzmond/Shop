package org.telran.shop.repository;

import org.springframework.stereotype.Repository;
import org.telran.shop.model.Product;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private Map<Product, Integer> products = new HashMap<>(); //product integer

    @PostConstruct
    public void init() {
        products.put(new Product("Stan Smith Shoes", 99.99, "Adidas"), 15);
        products.put(new Product("Cali Star Women Sneaker", 89.99, "Puma"), 10);
        products.put(new Product("Nike Air Monarch IV", 74.99, "Nike"), 5);

    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public Product findOne(String name) {
        List<Product> productList = products.keySet().stream().toList();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product add(Product product) {
        int value = products.getOrDefault(product, 0);
        products.put(product, value + 1);
        return product;
    }

    @Override
    public Product remove(Product product) {
        if (products.containsKey(product)) {
            int count = products.get(product);
            if (count == 1) {
                products.remove(product);
            } else {
                products.put(product, count - 1);
            }
            return product;
        }
        return null;
    }
}