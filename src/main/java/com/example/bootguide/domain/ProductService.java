package com.example.bootguide.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product insertProuct(Product product) {
        Product savedProduct = productRepository.save(product);

        return savedProduct;
    }

    public Product selectProduct(Long number) {
        Product selectedProduct = productRepository.getById(number);

        return selectedProduct;
    }

    public Product updateProductName(Long number, String name) throws Exception {
        Product product = productRepository.findById(number).orElseThrow(Exception::new);

        product.setName(name);
        product.setUpdatedAt(LocalDateTime.now());

        productRepository.save(product);

        return product;
    }

    public void deleteProduct(Long number) throws Exception {
        Product product = productRepository.findById(number).orElseThrow(Exception::new);

        productRepository.delete(product);
    }
}
