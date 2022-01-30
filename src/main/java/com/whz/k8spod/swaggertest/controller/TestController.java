package com.whz.k8spod.swaggertest.controller;

import com.whz.k8spod.swaggertest.config.TestConfig;
import com.whz.k8spod.swaggertest.dao.OrderMapper;
import com.whz.k8spod.swaggertest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestConfig testConfig;
    @Autowired
    private OrderMapper orderMapper;


    @GetMapping("/hello")
    public String hello(){
        return testConfig.getMessage();
    }

    @GetMapping("/orders")
    public List<Order> get(){
        return orderMapper.findAll();
    }

}
