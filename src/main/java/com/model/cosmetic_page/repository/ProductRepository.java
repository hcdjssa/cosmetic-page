package com.model.cosmetic_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.cosmetic_page.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
