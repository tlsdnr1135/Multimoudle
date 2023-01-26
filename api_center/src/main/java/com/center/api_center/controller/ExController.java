package com.center.api_center.controller;

import com.common.api_common.ExService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

    private final ExService exService;

    public ExController(ExService exService) {
        this.exService = exService;
    }

    @GetMapping("/api")
    public ResponseEntity<String> selectName(){
        System.out.println("sdsdsssdsdssd");
        return ResponseEntity.ok().body(exService.selectName());
    }

    @GetMapping("/api/wook")
    public String selectNamsssse(){
        System.out.println("ㄴㅇㅁㄴㅁㅇㄴㅁㅇㄴ");
        return "woook";
    }



}
