package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestResource {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
