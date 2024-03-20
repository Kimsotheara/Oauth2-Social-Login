package com.theara.oauth2sociallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello, Home !";
    }

    @GetMapping("/secure")
    public String secure(){
        return "Hello, Secure Page!";
    }

}
