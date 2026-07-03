package com.tshaped9;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestNumOps {
       NumberOps num=new NumberOps();
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10,12})
	void testisEven(int number) {
		Boolean status=num.isEven(number);
		assertTrue(status);
	}

}
