package com.vk.mobileservices.repository;

import com.vk.mobileservices.dto.ShopSelectRequestDto;
import com.vk.mobileservices.dto.ShopSelectResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.lang.reflect.Type;
import java.util.*;

@Repository
@RequiredArgsConstructor

public class ShopCustomRepository implements IShopCustomRepository {
    private final EntityManager entityManager;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<ShopSelectResponseDto> getShops(ShopSelectRequestDto selectRequestDto) {
        StringJoiner joiner = new StringJoiner(" ");
        Map<String, Object> parameters = new HashMap<>();
        joiner.add("Select new map(s.id as id, s.name as name, s.latitude as latitude, s.longitude as longitude, s.discountRate as discountRate, s.address as address, s.cardType as cardType, s.shopType as shopType) from  Shop as s where 1 = 1");
        if (Objects.nonNull(selectRequestDto.getLatitude()) && selectRequestDto.getLatitude() > 0) {
            joiner.add("and s.latitude = :latitude");
            parameters.put("latitude", selectRequestDto.getLatitude());
        }
        if (Objects.nonNull(selectRequestDto.getLongitude()) && selectRequestDto.getLongitude() > 0) {
            joiner.add("and s.longitude = :longitude");
            parameters.put("longitude", selectRequestDto.getLongitude());
        }
        if (Objects.nonNull(selectRequestDto.getLongitudeEast()) && selectRequestDto.getLongitudeEast() > 0) {
            joiner.add("and s.longitude <= :longitudeEast");
            parameters.put("longitudeEast", selectRequestDto.getLongitudeEast());
        }
        if (Objects.nonNull(selectRequestDto.getLongitudeWest()) && selectRequestDto.getLongitudeWest() > 0) {
            joiner.add("and s.longitude >= :longitudeWest");
            parameters.put("longitudeWest", selectRequestDto.getLongitudeWest());
        }
        if (Objects.nonNull(selectRequestDto.getLatitudeNorth()) && selectRequestDto.getLatitudeNorth() > 0) {
            joiner.add("and s.latitude <= :latitudeNorth");
            parameters.put("latitudeNorth", selectRequestDto.getLatitudeNorth());
        }
        if (Objects.nonNull(selectRequestDto.getLatitudeSouth()) && selectRequestDto.getLatitudeSouth() > 0) {
            joiner.add("and s.latitude >= :latitudeSouth");
            parameters.put("latitudeSouth", selectRequestDto.getLatitudeSouth());
        }
        Query query = entityManager.createQuery(joiner.toString());
        for (String key : parameters.keySet()) {
            query.setParameter(key, parameters.get(key));
        }
        Type listType = new TypeToken<List<ShopSelectResponseDto>>() {
        }.getType();
        return modelMapper.map(query.getResultList(), listType);
    }
}
