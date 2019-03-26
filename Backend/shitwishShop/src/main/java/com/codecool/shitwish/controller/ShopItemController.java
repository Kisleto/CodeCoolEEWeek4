package com.codecool.shitwish.controller;

import com.codecool.shitwish.entity.ShopItem;
import com.codecool.shitwish.service.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ShopItemController {

    @Autowired
    ShopItemService shopItemService;

    @GetMapping(path ="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Iterable<ShopItem> getAllShopItem() {
        return shopItemService.getAllShopItem();
    }

}
