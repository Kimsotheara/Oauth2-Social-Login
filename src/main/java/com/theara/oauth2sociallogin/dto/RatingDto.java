package com.theara.oauth2sociallogin.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RatingDto {
    private double rate;
    private int count;

}
