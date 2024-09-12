package com.model.cosmetic_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.cosmetic_page.entity.User;
import com.model.cosmetic_page.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User loginUser(String username, String password) {
        return userRepository.findByUsername(username)
            .filter(user -> user.getPassword().equals(password))  // Use BCrypt in production
            .orElse(null);
    }
}
