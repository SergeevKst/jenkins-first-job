package com.sergeev.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jenkins")
public class FirstController {

    @GetMapping
    public String sayWords(){
        return "I'll work in this company";
    }
}
