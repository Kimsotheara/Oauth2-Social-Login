package com.theara.oauth2sociallogin.service;

import com.theara.oauth2sociallogin.dto.ProductDto;
import com.theara.oauth2sociallogin.feignClient.ApiClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private ApiClient apiClient;
    public ResponseEntity<ProductDto> getProductById(Long proId){
        ProductDto product = apiClient.getProductById(proId);
        return ResponseEntity.ok(product);
    }
}
