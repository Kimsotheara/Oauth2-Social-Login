package com.theara.oauth2sociallogin.feignClient;

import com.theara.oauth2sociallogin.dto.CartDto;
import com.theara.oauth2sociallogin.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PRODUCT-SERVICE", url = "https://fakestoreapi.com")
public interface ApiClient {
    @GetMapping(value = "/products/{proId}")
    ProductDto getProductById(@PathVariable Long proId);

    @GetMapping(value = "/carts/{cartId}")
    CartDto getCartById(@PathVariable Long cartId);
}

