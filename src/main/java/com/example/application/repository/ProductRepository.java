package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
