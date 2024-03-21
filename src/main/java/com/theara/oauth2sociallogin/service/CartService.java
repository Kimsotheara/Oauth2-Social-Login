package com.theara.oauth2sociallogin.service;

import com.theara.oauth2sociallogin.dto.CartDto;
import com.theara.oauth2sociallogin.feignClient.ApiClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartService {
    private ApiClient apiClient;
    public ResponseEntity<CartDto> getCartById(Long cartId){
        CartDto cartDto = this.apiClient.getCartById(cartId);
        return ResponseEntity.ok(cartDto);
    }
}
