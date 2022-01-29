package com.whz.k8spod.swaggertest.controller;

import com.whz.k8spod.swaggertest.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestConfig testConfig;

    @GetMapping("/hello")
    public String hello(){
        return testConfig.getMessage();
    }

}
