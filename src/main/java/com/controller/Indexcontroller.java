package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Indexcontroller {

    @RequestMapping("/hellow")
    public String hello(){
       System.out.println("hellow");
        return "index.html";
    }

}
