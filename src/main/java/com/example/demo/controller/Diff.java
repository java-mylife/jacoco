package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Diff {

    @RequestMapping(value = "/diff")
    @ResponseBody
    public String diff(){
        return "这是diff方法";
    }
}
