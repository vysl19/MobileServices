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
public class ShopSelectRequestDto {
    private Double latitude;
    private Double longitude;
    private Double latitudeNorth;
    private Double latitudeSouth;
    private Double longitudeEast;
    private Double longitudeWest;
    private Integer cardType;
    private ShopType shopType;
}
