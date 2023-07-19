package org.telran.shop.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.telran.shop.model.Product;
import org.telran.shop.repository.ProductRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    private ProductService productService;


    @BeforeEach
    void init() {
        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        productRepository.init();
        productService = new ProductServiceImpl(productRepository);
    }

    @Test
    void getAll() {
        assertEquals(3, productService.getAll().size());
    }

    @Test
    void findOne() {
        Product product = productService.findOne("Stan Smith Shoes");
        assertNotNull(product);
        assertEquals(99.99, product.getPrice());
        assertEquals("Adidas", product.getManufacturer());
    }

    @Test
    void add() {
        Product product = productService.add(new Product("Snikers",49.99,"Puma"));
        assertEquals(4, productService.getAll().size());
    }
}