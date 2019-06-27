package com.com.springboottomcatredis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping
public class HelloController {
    @Autowired
    private StringRedisTemplate template;

    @GetMapping("/")
    public String index() {
        String key=new Date().toString()
;        template.opsForValue().set(key,"springboottomcatredis");
        return template.opsForValue().get(key);

    }
}