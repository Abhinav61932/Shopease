package com.example.Shopease.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Shopease.model.Product;
import com.example.Shopease.repo.ProductRepo;

@Service
public class ProductService {

    private final ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}