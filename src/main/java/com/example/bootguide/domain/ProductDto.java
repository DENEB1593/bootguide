package com.example.bootguide.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

public class ProductDto {

    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class ProductRequestDto {
        String name;
        int price;
        int stock;
    }

    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class ProductResponseDto {
        Long number;
        String name;
        int price;
        int stock;
    }
}
