package com.example.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnRestController {



    @GetMapping("/public")
    public String salut() {
        return "Buna lume!";
    }


}
