package com.vk.mobileservices.dto;

import com.vk.mobileservices.enums.ShopType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopSelectResponse {
    private long id;
    private String name;
    private String address;
    private Double longitude;
    private Double latitude;
    private Integer cardType;
    private ShopType shopType;
    private Double discountRate;
}
