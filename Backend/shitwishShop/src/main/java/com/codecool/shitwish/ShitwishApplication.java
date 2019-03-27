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
                    .imgURL("https://i0.wp.com/www.cordcuttersnews.com/wp-content/uploads/2015/10/Chromecast2-e1472903746343.png?ssl=1")
                    .price(200)
                    .build();

            ShopItem shopItem2 = ShopItem.builder()
                    .category("tech")
                    .description("Smart Watch")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(100000)
                    .build();

            ShopItem shopItem3 = ShopItem.builder()
                    .category("tech")
                    .description("Smart Watch")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(101000)
                    .build();

            ShopItem shopItem4 = ShopItem.builder()
                    .category("tech")
                    .description("Smart Watch")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(10000)
                    .build();

            ShopItem shopItem5 = ShopItem.builder()
                    .category("tech")
                    .description("Smart Watch")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(1000)
                    .build();

            ShopItem shopItem6 = ShopItem.builder()
                    .category("tech")
                    .description("Smart Watch")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(100000)
                    .build();

            shopItemRepository.save(shopItem);
            shopItemRepository.save(shopItem2);
            shopItemRepository.save(shopItem3);
            shopItemRepository.save(shopItem4);
            shopItemRepository.save(shopItem5);
            shopItemRepository.save(shopItem6);
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
