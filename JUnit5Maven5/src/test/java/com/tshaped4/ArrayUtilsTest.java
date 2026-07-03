package com.tshaped4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

	@Test
	void test() {
		int input[]= {4,2,1,5,6};
		int expectedResult[]= {1,2,4,5,6};
		int actual[]=ArrayUtils.sortArray(input);
		//assertArrayEquals(actual,expectedResult,"Arrays are not matching with expect");
		assertEquals(actual,expectedResult,"Arrays are not matching with expect");//gives false as it compare the reference and both are different
		
	}

}
