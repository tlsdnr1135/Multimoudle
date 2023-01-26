package com.center.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class ApiCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiCenterApplication.class, args);
        NameEntity nameEntity = new NameEntity();
        nameEntity.setName("신욱");
        System.out.println(nameEntity.getName());
    }
}
