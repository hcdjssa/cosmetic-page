package com.model.cosmetic_page.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.model.cosmetic_page.entity.Order;
import com.model.cosmetic_page.entity.User;
import com.model.cosmetic_page.service.OrderService;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String showOrders(@SessionAttribute("user") User user, Model model) {
        List<Order> orders = orderService.getOrdersByUser(user.getId());
        model.addAttribute("orders", orders);
        return "order";
    }

    @PostMapping("/place")
    public String placeOrder(@ModelAttribute Order order, @SessionAttribute("user") User user) {
        order.setUser(user);
        orderService.createOrder(order);
        return "redirect:/order";
    }
}
