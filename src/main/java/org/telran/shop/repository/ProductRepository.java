package org.telran.shop.repository;

import org.telran.shop.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    Product findOne(String name);

    Product add(Product product);

    Product remove(Product product);
}