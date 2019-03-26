package com.codecool.shitwish.service;

import com.codecool.shitwish.entity.ShopItem;
import com.codecool.shitwish.repository.ShopItemRepository;
import com.fasterxml.jackson.core.io.JsonEOFException;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ShopItemService {
    @Autowired
    ShopItemRepository shopItemRepository;

    public List<ShopItem> getAllShopItem() {
        return shopItemRepository.findAll();
    }
}
