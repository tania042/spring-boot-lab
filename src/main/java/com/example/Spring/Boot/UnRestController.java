package com.example.Spring.Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnRestController {


    @GetMapping("/hello")
    public String hello() {
        return "Salut la toti!";
    }
}
