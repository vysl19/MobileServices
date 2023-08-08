package com.vk.mobileservices.service;

import com.vk.mobileservices.dto.ShopCreateRequestDto;
import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponse;
import com.vk.mobileservices.enums.ShopType;
import com.vk.mobileservices.model.Shop;
import com.vk.mobileservices.repository.ShopCustomRepository;
import com.vk.mobileservices.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ShopService implements IShopService {
    private final ModelMapper modelMapper=new ModelMapper();
    private final ShopRepository shopRepository;
    private final ShopCustomRepository shopCustomRepository;

    @Override
    public void createShop(ShopCreateRequestDto requestDto) {
        Shop shop = modelMapper.map(requestDto, Shop.class);
        shopRepository.save(shop);
    }

    @Override
    public List<ShopSelectResponse> getShops(ShopSelectRequestDto requestDto) {
        return shopCustomRepository.getShops(requestDto);
    }
}
