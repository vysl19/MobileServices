package com.vk.mobileservices.model;


import com.vk.mobileservices.enums.ShopType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "shop")
@Getter
@Setter
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;

    private ShopType shopType;
    private int cardType;
    private double latitude;
    private double longitude;
    private double discountRate;

}
