package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Testing")
public class TestController {

    @GetMapping("/getInfo")
    public String getInfo()
    {
        return "getinfo successfully";
    }
}
