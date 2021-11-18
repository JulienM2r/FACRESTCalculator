package com.rest.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.rest.calculator.services.MultiplyService;

public class MultiplyServiceTest {


    MultiplyService multiply;

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
}