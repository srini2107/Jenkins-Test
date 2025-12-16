package com.test.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJenkins {

    @GetMapping("/test1")
    public String test1() {
        return "Jenkins test successful!";
    }

}
