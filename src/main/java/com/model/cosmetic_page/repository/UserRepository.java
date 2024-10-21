package com.model.cosmetic_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.cosmetic_page.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
