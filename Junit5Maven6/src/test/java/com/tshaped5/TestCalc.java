package com.tshaped5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void test() {
		Calc c=new Calc();
		assertThrows(ArithmeticException.class,()->c.divide(100, 0));
	}

}
