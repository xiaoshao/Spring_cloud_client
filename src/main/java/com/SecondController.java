package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @Value("${firstProperty}")
    private String firstProperty;

    @GetMapping("/test")
    public String test() {
        return firstProperty;
    }
}
