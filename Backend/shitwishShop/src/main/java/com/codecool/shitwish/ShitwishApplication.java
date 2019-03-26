package com.codecool.shitwish;

import com.codecool.shitwish.entity.ShopItem;
import com.codecool.shitwish.repository.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
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

            ShopItem shopItem2 = ShopItem.builder()
                    .category("tech")
                    .description("home")
                    .name("Radio")
                    .price(40)
                    .build();

            shopItemRepository.save(shopItem);
            shopItemRepository.save(shopItem2);
        };
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/products/**"))
                .build();
    }

}
