package com.example.homework2_11spring.service;



import java.util.List;

public interface OrderService {
    void addItemsToCart(List<Integer> itemsId);
    List<Integer> getItems();
}