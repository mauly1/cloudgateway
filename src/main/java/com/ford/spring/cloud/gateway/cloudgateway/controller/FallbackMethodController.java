package com.ford.spring.cloud.gateway.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service is taking longer" +
                " then expected please try later";
    }
    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "Department service is taking longer" +
                " then expected please try later";
    }
}
