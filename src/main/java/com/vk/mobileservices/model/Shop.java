package com.vk.mobileservices.model;


import com.vk.mobileservices.enums.ShopType;
import jakarta.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private ShopType shopType;
    private double latitude;
    private double longitude;
    private double discountRate;

    // getters and setters...
}
