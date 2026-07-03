package com.tshaped7;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class TestShapeArea {
      ShapesArea shape;
	@BeforeEach
	void Setup() {
		shape=new ShapesArea();
	}
	@Test
	@DisplayName("Testing area of square unit")
	//@EnabledOnOs(OS.WINDOWS)
	//@EnabledOnJre(JRE.JAVA_25)
	//@EnabledForJreRange(min=JRE.JAVA_18,max=JRE.JAVA_27)
	void testcomputeAreaOfSquare() {
		double length=3.0;
		assumeTrue(length<4.0);//if this condition in it is true then only assertEquals will run
		assertEquals(9.0,shape.computeAreaOfSquare(length));
		System.out.println("Running");
	}
	@Test
	//@EnabledOnOs(OS.LINUX)
	void testcomputeAreaOfCircle() {
		assertEquals(78.5,shape.computeAreaOfCircle(5.0));

	}  
	@AfterEach
	void run() {
		
	}

	
	
	

}
