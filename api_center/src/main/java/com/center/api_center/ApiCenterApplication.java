package com.center.api_center;

import com.common.api_common.ExService;
import com.common.api_common.NameEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan(value="com.common.api_common")
@ComponentScan(value="com.center.api_center")
@SpringBootApplication
public class ApiCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiCenterApplication.class, args);
        NameEntity nameEntity = new NameEntity();
        nameEntity.setName("신욱");
        System.out.println(nameEntity.getName());
    }
}
