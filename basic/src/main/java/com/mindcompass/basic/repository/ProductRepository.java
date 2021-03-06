package com.mindcompass.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindcompass.basic.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}