package com.tshaped3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPurchaseCourse {

	@Test
	void test() {
		PurchaseCourse course=new PurchaseCourse();
		boolean status=course.proceedWithCourse(new JavaCourse());
		assertTrue(status);//if status is true then test pass else not
	}

}
