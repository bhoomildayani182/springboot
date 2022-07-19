package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.net.URL;
import java.util.Date;


@RestController
public class DemoController {
    @GetMapping("/")
    public String Start(){
        return "Welcome to first lab";
    }
    @GetMapping("/getdate")
    public Date getdate(){
        return new Date();
    }

}
