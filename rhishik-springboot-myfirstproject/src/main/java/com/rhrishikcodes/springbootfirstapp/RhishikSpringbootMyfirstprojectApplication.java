package com.rhrishikcodes.springbootfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RhishikSpringbootMyfirstprojectApplication {
	@RequestMapping("/")
	String home() {
		return "Hello User!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RhishikSpringbootMyfirstprojectApplication.class, args);
	}

}
