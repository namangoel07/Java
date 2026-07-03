package com.tshaped2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class TestShapes1 {
	Shapes1 shape1=new Shapes1();
	@Test
	@DisplayName("Testing area of square unit")
	void testcomputeAreaOfSquare() {
		assertNotEquals(16.0,shape1.computeAreaOfSquare(4.0));//in this test case will fail as we do not need expected and actual should not equal
	}
	
	@Test
	@Disabled //to not consider during whole file testing
	void testcomputeAreaOfCircle() {//whether the test case is pass or fail it will always evaluated and show if test case is fail
		assertEquals(7.5,shape1.computeAreaOfCircle(5.0),"Area of Circle Calculation");
	}  
	@Test
	void testcomputeAreaOfCircle_Supplier() {//by implementing supplier interface then it will not evaluate if test case is pass
		assertEquals(78.5,shape1.computeAreaOfCircle(5.0),()->"Area of Circle Calculation:");
	} 
	@Test
	void testgenerateUniqueId() {
		String id1=IDGenerator.generateUniqueId();
		String id2=IDGenerator.generateUniqueId();
		assertNotEquals(id1,id2);
		
	}
	
	
}
