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
                    .description("Watch anything from the toilet")
                    .name("Chrome cast")
                    .imgURL("https://i0.wp.com/www.cordcuttersnews.com/wp-content/uploads/2015/10/Chromecast2-e1472903746343.png?ssl=1")
                    .price(200)
                    .build();

            ShopItem shopItem2 = ShopItem.builder()
                    .category("tech")
                    .description("Overpriced watch don't even think about it dummy!")
                    .name("Apple Smart Watch")
                    .imgURL("https://geekyoursport.files.wordpress.com/2015/03/apple-watch-logo-main1.png")
                    .price(100000)
                    .build();

            ShopItem shopItem3 = ShopItem.builder()
                    .category("tech")
                    .description("If your dream was to kiss with Sir Alex it's a must buy")
                    .name("Sir Alex Ferguson Last gum")
                    .imgURL("http://3.bp.blogspot.com/-9tubfGCtJv8/UZ8kr7Jk_uI/AAAAAAAAW80/BVS5c8h20kw/s1600/ferguson.jpg")
                    .price(150000)
                    .build();

            ShopItem shopItem4 = ShopItem.builder()
                    .category("tech")
                    .description("Made in China, still better then the Iwatch, lol")
                    .name("Bicor Laptop")
                    .imgURL("http://www.alcordigital.hu/media/up/5/tn_21_cloudbook.png")
                    .price(60000)
                    .build();

            ShopItem shopItem5 = ShopItem.builder()
                    .category("garden")
                    .description("If you are annoyed by your girlfriend, just put her in here")
                    .name("Ark of the Covenant")
                    .imgURL("https://konteo.blogrepublik.eu/files/2015/10/frigy12.jpg")
                    .price(400000)
                    .build();

            ShopItem shopItem6 = ShopItem.builder()
                    .category("garden")
                    .description("Easy way to cut up your ham")
                    .name("LightSaber")
                    .imgURL("https://i.ebayimg.com/images/g/FzYAAOSwzGBb~WxR/s-l300.jpg")
                    .price(100000)
                    .build();

            ShopItem shopItem7 = ShopItem.builder()
                    .category("home")
                    .description("Fancy poop for Instagram")
                    .name("Glitter Poop Pills")
                    .imgURL("https://i.etsystatic.com/7866579/d/il/53c23c/695941766/il_340x270.695941766_bpbm.jpg?version=0")
                    .price(50)
                    .build();

            ShopItem shopItem8 = ShopItem.builder()
                    .category("home")
                    .description("Best place to do your fancy poop")
                    .name("The IPotty")
                    .imgURL("https://images-na.ssl-images-amazon.com/images/I/71Z-jnOg0QL._SY355_.jpg")
                    .price(5000)
                    .build();

            shopItemRepository.save(shopItem3);
            shopItemRepository.save(shopItem8);
            shopItemRepository.save(shopItem4);
            shopItemRepository.save(shopItem6);
            shopItemRepository.save(shopItem5);
            shopItemRepository.save(shopItem2);
            shopItemRepository.save(shopItem);
            shopItemRepository.save(shopItem7);
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
