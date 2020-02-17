package com.capg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	
	static Calculator cal;
	
	
@BeforeAll	
public static void getCal() {
	cal= new Calculator();
   
}
   
	//@Disabled
	@Test
	void testAdd() {
		//assertEquals(10,cal.add(5,5) );
	   Assumptions.assumeTrue(10==cal.add(5, 5));
	}

	
    //@RepeatedTest(5)
	@Test
	void testSub() {
		assertEquals(5,cal.sub(8,3) );
		System.out.println("add");
	}

	@Test
	void testMul() {
		assertTrue(15==cal.mul(5,3) );
	}
	@ParameterizedTest
	@ValueSource(strings= {"tom","jerry","Adam"})
	public void m1(String str) {
		
		assertTrue(str.length()>3);
	}

}
