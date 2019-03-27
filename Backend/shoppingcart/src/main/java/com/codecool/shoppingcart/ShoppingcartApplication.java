package com.codecool.shoppingcart;

import com.codecool.shoppingcart.entity.OrderProduct;
import com.codecool.shoppingcart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingcartApplication {

    @Autowired
    OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingcartApplication.class, args);
    }


    @Bean
    public CommandLineRunner init() {
        return args -> {
            OrderProduct orderProduct1 = OrderProduct.builder()
                    .name("Chrome Cast")
                    .price(200)
                    .quantity(2)
                    .build();

            OrderProduct orderProduct2 = OrderProduct.builder()
                    .name("Television")
                    .price(400)
                    .quantity(1)
                    .build();

            orderRepository.save(orderProduct1);
            orderRepository.save(orderProduct2);

        };
    }

}
