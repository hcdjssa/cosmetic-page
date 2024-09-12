package com.model.cosmetic_page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.cosmetic_page.entity.Product;
import com.model.cosmetic_page.repository.ProductRepository;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> searchProducts(@RequestParam String keyword) {
        return productRepository.findByNameContainingIgnoreCase(keyword);
    }
}
