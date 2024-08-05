package com.example.demo

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste/")
public class HelloController {

    @GetMapping("/hello")

    public String hello(){
        return "HelloWord"
    }

}