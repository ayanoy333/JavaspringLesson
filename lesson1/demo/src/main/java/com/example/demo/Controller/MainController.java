package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/help")
    public String help() {
        return "help";
    }

    @RequestMapping("/sample")
    public String sample() {
        return "sample";
    }
}
