package com.rest.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.rest.calculator.services.MultiplyService;
import com.rest.calculator.services.Trigo;


public class TrigoServiceTest {
	Trigo trigo;
	@BeforeEach                                         
    void setUp() {
    	trigo = new Trigo();
    }
	
	@Test                                               
    @DisplayName("cosinus 0 should work")   
    void testcos() {
        assertEquals(1, trigo.cos(0),     
                "cos 0 should work");  
    }
	
	@Test                                               
    @DisplayName("sinus 0 should work")   
    void testsin() {
        assertEquals(0, trigo.sin(0),"sinus 0 should work"); 
    }
	
	@Test                                               
    @DisplayName("sinus 90 should work")   
    void testsin90() {
        assertEquals(1, trigo.sin(90),"sinus 90 should work"); 
    }

}
