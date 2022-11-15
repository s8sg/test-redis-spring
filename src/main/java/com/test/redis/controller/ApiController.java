package com.test.redis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class ApiController {
    @GetMapping("/")
    public String ok () {
        return "ok";
    }
}
