package com.example.homework2_11spring.controller;

import com.example.homework2_11spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItemsToCart(@RequestParam List<Integer> itemsId) {
        orderService.addItemsToCart(itemsId);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}