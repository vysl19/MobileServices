package com.vk.mobileservices.service;

import com.vk.mobileservices.dto.ShopCreateRequestDto;
import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponseDto;

import java.util.List;

public interface IShopService {
    List<ShopSelectResponseDto> getShops(ShopSelectRequestDto selectRequestDto);
    void createShop(ShopCreateRequestDto requestDto);

}
