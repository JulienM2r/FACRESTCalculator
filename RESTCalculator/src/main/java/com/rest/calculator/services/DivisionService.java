package com.rest.calculator.services;
public class DivisionService {
	public String division(double a, double b) {
		if(b==0){
			return "division par zero impossible";
		}
	
        return " "+a / b;
    }

}
