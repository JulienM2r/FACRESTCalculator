package com.rest.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.rest.calculator.services.DivisionService;
import com.rest.calculator.services.MultiplyService;
import com.rest.calculator.services.additionservice;

public class MultiplyServiceTest {
	
	int a, b;
	String operateur = "+"; 
	
    MultiplyService multiply;
    additionservice addition;
    DivisionService division;
    
    

    @BeforeEach                                         
    void setUp() {
    	multiply = new MultiplyService();
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
        assertEquals(20, multiply.multiply(4, 5),     
                "Regular multiplication should work");  
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, multiply.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, multiply.multiply(5, 0), "Multiple with zero should be zero");
    }

    
   
    @Test
    void testMultiplay1() throws Exception{
    	assertEquals(0,addition.additionint(a, b));
    }
    
    
	@Test
    void testMultiplay() throws Exception{
    	int somme;
      if(operateur.equals("+")){
    	try{
    	  somme = a + b;
    	  System.out.println(somme);
    	}catch(Exception e) {
          System.out.println(e);
        }
      }
    	
      if(operateur.equals("-")){
    	try{
    	  somme = a - b;
    	  System.out.println(somme);
        }catch(Exception e) {
           System.out.println(e);
        }
      }
      if(operateur.equals("*")){
    	try{
    	 somme = a * b;
    	 System.out.println(somme);
        }catch(Exception e) {
           System.out.println(e);
        }
      }
      if(operateur.equals("/")){
    	  try{
	    	  somme = a / b;
	    	  System.out.println(somme);
    	  }catch(Exception e) {
              System.out.println(e);
          }
      }
      if(operateur.equals("")){
    	  try{
	    	  somme = a;
	    	  System.out.println(somme);
    	  }catch(Exception e) {
              System.out.println(e);
          }
      }
      if(operateur.equals("")){
    	  try{
	    	  somme = 0;
	    	  System.out.println(somme);
    	  }catch(Exception e) {
              System.out.println(e);
          }
      }
    
    } 
}
  
