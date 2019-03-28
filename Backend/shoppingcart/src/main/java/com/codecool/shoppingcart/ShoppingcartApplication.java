package com.codecool.shoppingcart;

import com.codecool.shoppingcart.entity.OrderProduct;
import com.codecool.shoppingcart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingcartApplication {

    @Autowired
    OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingcartApplication.class, args);
    }


    @Bean
    public CommandLineRunner init() {
        return args -> {
            OrderProduct orderProduct = OrderProduct.builder().id(2L).name("asd").price(20).build();
            orderRepository.save(orderProduct);

        };
    }
}
