package com.codecool.shitwish;

import com.codecool.shitwish.entity.ShopItem;
import com.codecool.shitwish.repository.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShitwishApplication {

    @Autowired
    ShopItemRepository shopItemRepository;

    public static void main(String[] args) {
        SpringApplication.run(ShitwishApplication.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {
            ShopItem shopItem = ShopItem.builder()
                    .category("tech")
                    .description("smart home")
                    .name("Chrome cast")
                    .price(200)
                    .build();

            shopItemRepository.save(shopItem);

        };
    }

}
