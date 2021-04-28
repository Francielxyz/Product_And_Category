package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
