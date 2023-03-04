package com.dev.sen.greeting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/v1")
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello(String name) {
        String greeting = "Hello "+name+"!";
        log.info("Greeting Message -> "+greeting);
        return greeting;
    }
}
