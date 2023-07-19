package org.telran.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.model.Product;
import org.telran.shop.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{name}")
    public Product findOne(@PathVariable(name = "name") String name) {
        return productService.findOne(name);
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }
}