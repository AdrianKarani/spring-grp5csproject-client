package com.example.springgrp5csprojectclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringGrp5csprojectClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGrp5csprojectClientApplication.class, args);
    }

}
