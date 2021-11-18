package com.rest.calculator.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.io.IOException;

import com.rest.calculator.services.MultiplyService;



@RestController
public class Controller {
	
	private MultiplyService multiply;
	

	@PostMapping("/multiply")
	public ResponseEntity<String> multiply( @RequestBody int nba, @RequestBody int nbb) throws IOException{
		
		int result;
		
		result = multiply.multiply(nba, nbb);
		String response = Integer.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}

	
	
	
	

	
	
	
	
	
	
	
}
