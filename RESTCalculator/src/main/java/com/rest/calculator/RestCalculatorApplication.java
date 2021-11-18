package com.rest.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.calculator.services.MultiplyService;

@SpringBootApplication
public class RestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCalculatorApplication.class, args);
		
		int a = 3;
		int b = 7;
		
		MultiplyService  ms= new MultiplyService();
		
		System.out.println(ms.multiply(a,b));
	}

}
