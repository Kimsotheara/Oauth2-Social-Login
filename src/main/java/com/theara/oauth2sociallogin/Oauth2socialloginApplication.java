package com.theara.oauth2sociallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Oauth2socialloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2socialloginApplication.class, args);
    }

}
