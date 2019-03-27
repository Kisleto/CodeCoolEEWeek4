package com.codecool.shoppingcart.controller;

import com.codecool.shoppingcart.entity.OrderProduct;
import com.codecool.shoppingcart.repository.OrderRepository;
import com.codecool.shoppingcart.service.OrderProductService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path ="/cart")
public class OrderProductController {

    @Autowired
    OrderProductService orderProductService;

    @Autowired
    OrderRepository orderRepository;

    @GetMapping
    public List<OrderProduct> getAll(){
        return orderRepository.findAll();
    }

    @PostMapping
    public void addToCart(@RequestBody String payload){
        System.out.println(payload);

    }

}

