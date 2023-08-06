package com.vk.mobileservices.controller;

import com.vk.mobileservices.model.Shop;
import com.vk.mobileservices.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
    private final ShopRepository shopRepository;

    @GetMapping("/")
    public List<Shop> getShops() {
        return shopRepository.findAll();
    }
}
