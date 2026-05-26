package com.example.Shopease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopease.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}