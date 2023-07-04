package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/docker")
public class DockerController {

    @GetMapping
    public String index(){
        return "Hello Boot Docker Example!";
    }
}