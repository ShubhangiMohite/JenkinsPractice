package com.example.jenkinspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("firstStep")
public class HelloJenkin
{
    @GetMapping("secondStep/{name}")
    public String getmsg(@PathVariable String name)
    {
        return "Hello Jenkin...We will do practice" ;
    }
}

//localhost:8989/firstStep/secondStep/fist
