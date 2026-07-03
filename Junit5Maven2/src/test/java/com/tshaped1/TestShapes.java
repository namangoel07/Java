package com.tshaped1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapes {
	Shapes shape=new Shapes();

	@Test
	void testcomputeSquareArea() //to test 1 method then right-click on method then run as junit test
	{
		
		double actualresult=shape.computeSquareArea(4);
		double expectedresult=16;
		assertEquals(expectedresult,actualresult);
	}
	@Test
	void testcomputeCircleArea() 
	{
		double actual=shape.computeCircleArea(5);
		double expected=78.5;
		assertEquals(expected,actual);
	}

}
