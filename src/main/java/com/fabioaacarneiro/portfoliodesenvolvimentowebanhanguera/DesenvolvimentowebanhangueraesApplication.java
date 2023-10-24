package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DesenvolvimentowebanhangueraesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesenvolvimentowebanhangueraesApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "página inicial";
	}
}
