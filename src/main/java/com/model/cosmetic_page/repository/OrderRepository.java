package com.model.cosmetic_page.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.cosmetic_page.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
