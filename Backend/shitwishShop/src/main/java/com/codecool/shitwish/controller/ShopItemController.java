package com.codecool.shitwish.controller;

import com.codecool.shitwish.entity.ShopItem;
import com.codecool.shitwish.service.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/products", headers = "Accept=application/json")
public class ShopItemController {

    @Autowired
    ShopItemService shopItemService;

    @GetMapping
    public Iterable<ShopItem> getAllShopItem() {
        return shopItemService.getAllShopItem();
    }

}
