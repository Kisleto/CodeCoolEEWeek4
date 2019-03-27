package com.codecool.shoppingcart.controller;

import com.codecool.shoppingcart.entity.OrderProduct;
import com.codecool.shoppingcart.repository.OrderRepository;
import com.codecool.shoppingcart.service.OrderProductService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@Controller
@RequestMapping(path ="/cart")
public class OrderProductController {

    @Autowired
    OrderProductService orderProductService;

    @Autowired
    OrderRepository orderRepository;

    @PostMapping
    public void addToCart(@RequestParam("name") String name,
                                  @RequestParam("price") double price,
                                  @RequestParam("ImgURL") String imgUrl){
        OrderProduct orderProduct = new OrderProduct(name, price, imgUrl);
        orderRepository.save(orderProduct);
    }

}

