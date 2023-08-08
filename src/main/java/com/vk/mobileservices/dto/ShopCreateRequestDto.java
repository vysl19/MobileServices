package com.vk.mobileservices.dto;

import com.vk.mobileservices.enums.ShopType;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopCreateRequestDto implements Serializable {
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private ShopType shopType;
    private Integer cardType;
    private double discountRate;
}
