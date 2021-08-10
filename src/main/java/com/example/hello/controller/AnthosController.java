package com.example.hello.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnthosController {

	@RequestMapping("/anthos")
	public String home() {
		return "Hello Anthos World";
	}

}
