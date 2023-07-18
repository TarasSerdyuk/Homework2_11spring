package com.example.homework2_11spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Card {
    private final List<Integer> items = new ArrayList<>();

    public void addItemsToCart(List<Integer> itemsId) {
        items.addAll(itemsId);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}