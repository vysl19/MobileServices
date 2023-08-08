package com.vk.mobileservices.repository;

import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponse;

import java.util.List;

public interface IShopCustomRepository {
    List<ShopSelectResponse> getShops(ShopSelectRequestDto selectRequestDto);
}
