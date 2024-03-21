package com.theara.oauth2sociallogin.controller;

import com.theara.oauth2sociallogin.dto.CartDto;
import com.theara.oauth2sociallogin.dto.ProductDto;
import com.theara.oauth2sociallogin.service.CartService;
import com.theara.oauth2sociallogin.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {
    private final ProductService productService;
    private final CartService cartService;

    @GetMapping("/")
    public String home(){
        return "Hello, Home !";
    }

    @GetMapping("/secure")
    public String secure(){
        return "Hello, Secure Page!";
    }

    @GetMapping("/products/{proId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long proId){
        return this.productService.getProductById(proId);
    }

    @GetMapping("/carts/{cartId}")
    public ResponseEntity<CartDto> getCartById(@PathVariable Long cartId){
        return this.cartService.getCartById(cartId);
    }

}
