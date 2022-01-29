package com.whz.k8spod.swaggertest;

import com.whz.k8spod.swaggertest.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TestConfig.class)
public class SwaggerTestApplication {

    public static void main(String[] args) {


        SpringApplication.run(SwaggerTestApplication.class, args);
    }

}
