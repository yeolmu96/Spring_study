package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "안녕");
        return "hello";
    }

    @GetMapping("hi")
    public String hi() {
        return "Hi World!";
    }

    @GetMapping("bye")
    public String bye() { return "Bye World!";}
}