package com.tshape;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestManipulateString {

	@Test
	void testreverseString() {//in junit 4 writing public is mandatory but here its not here it can be any and there should no return type else void
		ManipulateString str=new ManipulateString();
		String actualResult=str.reverseString("Java");
		String expectedResult="avaJ";
		assertEquals(expectedResult,actualResult);
	}

}
