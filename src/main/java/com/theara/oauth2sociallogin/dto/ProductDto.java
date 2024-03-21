package com.theara.oauth2sociallogin.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductDto {

    private Integer id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private RatingDto rating;
}
