package com.example.homework2_11spring.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class OrderServiceImpl implements OrderService{
    private final Card card;

    public OrderServiceImpl(Card card) {
        this.card = card;
    }

    @Override
    public void addItemsToCart(List<Integer> itemsId) {
        card.addItemsToCart(itemsId);
    }

    @Override
    public List<Integer> getItems() {
        return card.getItems();
    }
}