package com.rest.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.calculator.services.MultiplyService;

@SpringBootApplication
public class RestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCalculatorApplication.class, args);
		
	}

}
