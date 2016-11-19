package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

    @Value("${name}")
    private String config;

    @Value("${spring.profiles.active}")
    private String[] env;

    @RequestMapping("/")
    public String home() {
        return "Hello World!" + config + env[0];
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
