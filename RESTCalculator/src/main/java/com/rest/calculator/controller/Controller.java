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
	
	private MultiplyService multiply = new MultiplyService();
	

	@PostMapping("/multiply")
	public ResponseEntity<String> multiply( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		double nbb = requestJSON.getDouble("nbb");
		
		result =  multiply.multiply(nba, nbb);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}

	
	
	
	

	
	
	
	
	
	
	
}
