package com.rest.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.rest.calculator.services.MultiplyService;
import com.rest.calculator.services.additionservice;

public class AdditionService {


    additionservice add;

    @BeforeEach                                         
    void setUp() {
    	add = new additionservice();
    }

    @Test                                               
    @DisplayName("Simple add should work")   
    void testAddition() {
        assertEquals(0, add.additiondouble(10, 10),"Regular multiplication should work");  
        assertEquals(100, add.additiondouble(50, 50),"Regular multiplication should work");  
    }

   // @RepeatedTest(5)                                    
  /*  @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, multiply.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, multiply.multiply(5, 0), "Multiple with zero should be zero");
    }*/
}