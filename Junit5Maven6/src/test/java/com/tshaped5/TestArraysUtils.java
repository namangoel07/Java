package com.tshaped5;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class TestArraysUtils {

	@Test
	void test() {
		int input[]=null;
		assertThrows(NullPointerException.class,()->Arraysutils.SortArray(input));
	}

}
