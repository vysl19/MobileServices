package com.vk.mobileservices.service;

import com.vk.mobileservices.dto.ShopCreateRequestDto;
import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponse;
import com.vk.mobileservices.model.Shop;

import java.util.List;

public interface IShopService {
    List<ShopSelectResponse> getShops(ShopSelectRequestDto selectRequestDto);
    void createShop(ShopCreateRequestDto requestDto);

}
