package org.telran.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.model.Product;
import org.telran.shop.repository.CartRepository;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductService productService;

    @Override
    public List<Product> showAll() {
        return cartRepository.showAll();
    }

    @Override
    public void addToCart(Product product) {
        Product removed = productService.remove(product);
        if (removed != null) {
            cartRepository.addToCart(product);
        }
    }

    @Override
    public void removeFromCart(Product product) {
        if (product != null) {
            cartRepository.removeFromCart(product);
            productService.add(product);
        }
    }
}