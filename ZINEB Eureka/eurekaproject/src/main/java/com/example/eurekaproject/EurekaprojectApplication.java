package com.example.eurekaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaprojectApplication.class, args);
    }

}
