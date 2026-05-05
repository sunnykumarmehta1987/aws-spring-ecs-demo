package com.sun.awsprac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        long timestamp = System.currentTimeMillis();
        return "Latest deployment at: " + now.format(formatter) +
               " | Timestamp: " + timestamp +
               " | Response ID: " + java.util.UUID.randomUUID().toString().substring(0, 8) +
               " | Version 4.1";
    }

    @GetMapping("/hellow")
    public String hellow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Latest fresh response at: " + now.format(formatter) + " - Version 3.0";
    }
}
