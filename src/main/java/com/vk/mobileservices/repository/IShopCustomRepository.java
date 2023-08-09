package com.vk.mobileservices.repository;

import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponseDto;

import java.util.List;

public interface IShopCustomRepository {
    List<ShopSelectResponseDto> getShops(ShopSelectRequestDto selectRequestDto);
}
