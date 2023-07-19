package org.telran.shop.service;

import org.telran.shop.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    Product findOne (String name);

    Product add(Product product);

    Product remove(Product product);
}