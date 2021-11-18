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
	
	
	@PostMapping("/plus")
	public ResponseEntity<String> plus( @RequestBody String entree) {
		
		int result;
		JSONObject entreeJSON = new JSONObject(entree);
		int nba = entreeJSON.getInt('nba');
		result = multiply.plus(nba, nbb);
		String response = Integer.toString(result);
		
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/multiply")
	public ResponseEntity<String> multiply( @RequestBody int nba, @RequestBody int nbb) throws IOException{
		
		int result;
		
		result = multiply.multiply(nba, nbb);
		String response = Integer.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}

	
	@PostMapping("/devide")
	public ResponseEntity<String> divide( @RequestBody int nba, @RequestBody int nbb) throws IOException{
		
		int result;
		
		result = multiply.divide(nba, nbb);
		String response = Integer.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/moin")
	public ResponseEntity<String> moin( @RequestBody int nba, @RequestBody int nbb) throws IOException{
		
		int result;
		
		result = multiply.moins(nba, nbb);
		String response = Integer.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	

	
	
	
	
	
	
	
}
