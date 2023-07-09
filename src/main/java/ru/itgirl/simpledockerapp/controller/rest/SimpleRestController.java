package ru.itgirl.simpledockerapp.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @GetMapping("/")
    public String hello() {
        return "Hello Docker!";
    }
}
