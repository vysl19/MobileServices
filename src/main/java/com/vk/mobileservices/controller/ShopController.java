package com.vk.mobileservices.controller;

import com.vk.mobileservices.dto.ResponseDto;
import com.vk.mobileservices.dto.ShopCreateRequestDto;
import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponseDto;
import com.vk.mobileservices.service.IShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
    private final IShopService shopService;

    @PostMapping("/get-shops")
    public ResponseDto<List<ShopSelectResponseDto>> getShops(@RequestBody ShopSelectRequestDto requestDto) {
        ResponseDto<List<ShopSelectResponseDto>> result = new ResponseDto<>();
        try{
            result.setSuccess(true);
            result.setResultCode(HttpStatus.OK.value());
            result.setBody(shopService.getShops(requestDto));
        }
        catch (Exception e){
            result.setSuccess(false);
            result.setResultCode(HttpStatus.BAD_REQUEST.value());
        }

        return result;
    }

    @PostMapping("/save")
    public ResponseDto<Void> createShop(@RequestBody ShopCreateRequestDto shop) {
        ResponseDto<Void> result = new ResponseDto<>();
        try{
            shopService.createShop(shop);
            result.setSuccess(true);
            result.setResultCode(HttpStatus.CREATED.value());
        }
        catch (Exception e){
            result.setSuccess(false);
            result.setResultCode(HttpStatus.BAD_REQUEST.value());
        }

        return result;
    }
}
