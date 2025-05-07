package com.acc.route53.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ACCController {

    @GetMapping("/")
    public String findUMC() {
        return "hello, world!";
    }
}