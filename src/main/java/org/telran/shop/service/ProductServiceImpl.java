package org.telran.shop.service;

import org.springframework.stereotype.Service;
import org.telran.shop.model.Product;
import org.telran.shop.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product findOne(String name) {
        return productRepository.findOne(name);
    }

    @Override
    public Product add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public Product remove(Product product) {
        return productRepository.remove(product);
    }
}