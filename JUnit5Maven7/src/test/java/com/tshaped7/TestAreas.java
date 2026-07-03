package com.tshaped7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestAreas {
	//before running any method object is created as methods are not static
	TestAreas(){//as many test methods that many objects  to avoid this we use @testInstance which create single instance
		System.out.println("Object Created");
	}
	@BeforeAll
	static void beforeAll() {//beforeall and afterall will only apply to static methods else it will give exception 
		System.out.println("Before all test cases");
	}
           Areas a;
	@BeforeEach
	void Setup() {
		a=new Areas();
		System.out.println("Before Each");
	}
		
		@Test
		@DisplayName("Testing area of square unit")
		void testcomputeAreaOfSquare() {
			assertEquals(16.0,a.computeAreaOfSquare(4.0));
			System.out.println("Actual here");
		}
		
		@Test
		void testcomputeAreaOfCircle() {//whether the test case is pass or fail it will always evaluated and show if test case is fail
			assertEquals(78.5,a.computeAreaOfCircle(5.0),"Area of Circle Calculation");
			System.out.println("Actual here");
		}  
		
	@AfterEach
	void run() {
		System.out.println("After each");
	}
	@AfterAll
	static void afterAll() {//if we use @TestInstance then we can write beforeall and afterall without using static methods
		System.out.println("After all the test cases");
	}

}
