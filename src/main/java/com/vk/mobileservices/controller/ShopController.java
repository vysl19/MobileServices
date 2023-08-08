package com.vk.mobileservices.controller;

import com.vk.mobileservices.dto.ShopCreateRequestDto;
import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponse;
import com.vk.mobileservices.model.Shop;
import com.vk.mobileservices.repository.ShopRepository;
import com.vk.mobileservices.service.IShopService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
    private final IShopService shopService;

    @PostMapping("/get-shops")
    public List<ShopSelectResponse> getShops(@RequestBody ShopSelectRequestDto requestDto) {
        return shopService.getShops(requestDto);
    }

    @PostMapping("/save")
    public ResponseEntity.HeadersBuilder<?> createShop(@RequestBody ShopCreateRequestDto shop) {
        shopService.createShop(shop);
        return ResponseEntity.noContent();
    }
}
