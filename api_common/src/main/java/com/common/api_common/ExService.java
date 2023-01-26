package com.common.api_common;

import org.springframework.stereotype.Service;

@Service
public class ExService {
    public String selectName(){
        NameEntity nameEntity = new NameEntity();
        nameEntity.setName("신욱");
        return nameEntity.getName();
    }
}
