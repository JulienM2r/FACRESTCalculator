package com.rest.calculator.services;

public class additionservice {
	public double additiondouble(double a, double b) {
        return a + b;
    }
	
	public double additiontrois(double a, double b, double c) {
        return additiondouble(a,b) + c;
    }
	
	public int additionint(int a, int b) {
        return a + b;
	}
	
	public double sinus(double a) {
		return Math.sin(a);
	}

}
