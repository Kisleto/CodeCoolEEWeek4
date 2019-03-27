package com.codecool.shoppingcart.service;

import com.codecool.shoppingcart.entity.OrderProduct;
import com.codecool.shoppingcart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService {

    @Autowired
    OrderRepository orderRepository;

    public List<OrderProduct> getAllOrderProduct() {
        return orderRepository.findAll();
    }
}
