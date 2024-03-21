package com.theara.oauth2sociallogin.dto;

import lombok.*;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CartDto {
    private Integer id;
    private int userId;
    private String date;
    private List<ProductDetailDto> products;
    private int __v;
}
