package com.rest.calculator.services;

public class IntOperateurService {
	
	public int operation(int a, int b, String op) {
		if(op.equals("+")) {
			return a+b;
		}else if(op.equals("-")) {
			return a-b;
		}else if(op.equals("*")) {
			return a*b;
		}else if(op.equals("/") && b!=0) {
			return a/b;
		}else if(op.equals("%")) {
			return a%b;
		}else if(op.equals("^")) {
			return (int) Math.pow(a, b);
		}else {
			return 0;
		}
		
	}

}
