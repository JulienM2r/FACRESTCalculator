package com.rest.calculator.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.io.IOException;

import com.rest.calculator.services.MultiplyService;
import com.rest.calculator.services.additionservice;
import com.rest.calculator.services.DivisionService;
import com.rest.calculator.services.RacineServices;
import com.rest.calculator.services.SubstractService;
import com.rest.calculator.services.Trigo;



@RestController
public class Controller {
	
	private MultiplyService multiply = new MultiplyService();
	private additionservice addition = new additionservice();
	private DivisionService division = new DivisionService();
	private SubstractService substract = new SubstractService();
	private RacineServices racine = new RacineServices();
	private Trigo trigo = new Trigo();
	
	
	
	
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
	
	@PostMapping("/addition_double")
	public ResponseEntity<String> addition_double( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		double nbb = requestJSON.getDouble("nbb");
		
		result =  addition.additiondouble(nba, nbb);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/addition_int")
	public ResponseEntity<String> addition_int( @RequestBody String request) throws IOException{
		
		int result;
		JSONObject requestJSON = new JSONObject(request);
		int nba = requestJSON.getInt("nba");
		int nbb = requestJSON.getInt("nbb");
		
		result =  addition.additionint(nba, nbb);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	@PostMapping("/addition_trois")
	public ResponseEntity<String> addition_trois( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getInt("nba");
		double nbb = requestJSON.getInt("nbb");
		double nbc = requestJSON.getInt("nbc");
		
		result =  addition.additiontrois(nba, nbb, nbc);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/division")
	public ResponseEntity<String> devision( @RequestBody String request) throws IOException{
		
		String result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		double nbb = requestJSON.getDouble("nbb");
		
		result =  division.division(nba, nbb);
		return new ResponseEntity<String>(result, HttpStatus.OK);
		
	}
	
	@PostMapping("/substract")
	public ResponseEntity<String> substract( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		double nbb = requestJSON.getDouble("nbb");
		
		result =  substract.substract(nba, nbb);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/racine")
	public ResponseEntity<String> racine( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		
		result =  racine.racine(nba);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/sin")
	public ResponseEntity<String> sin( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("sin");
		
		result =  trigo.sin(nba);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/cos")
	public ResponseEntity<String> cos( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		
		result =  trigo.cos(nba);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/asin")
	public ResponseEntity<String> asin( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		
		result =  trigo.asin(nba);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/acos")
	public ResponseEntity<String> acos( @RequestBody String request) throws IOException{
		
		double result;
		JSONObject requestJSON = new JSONObject(request);
		double nba = requestJSON.getDouble("nba");
		
		result =  trigo.acos(nba);
		String response = Double.toString(result);
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}

	
	
	
	

	
	
	
	
	
	
	
}
