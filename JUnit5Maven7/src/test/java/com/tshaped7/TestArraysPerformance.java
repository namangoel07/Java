package com.tshaped7;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class TestArraysPerformance {

//	@Test
//	void test() {
//	       int input[]= {4,2,5,1,6};
//	       assertTimeout(Duration.ofMillis(31),()->ArraysPerformance.sortArrays(input));
//	}
	@RepeatedTest(2)
	void testSortArray(RepetitionInfo info) {
	       int input[]= {4,2,5,1,6};
	       if(info.getCurrentRepetition()==1)
	       assertTimeout(Duration.ofMillis(20),()->ArraysPerformance.sortArrays(input));
	       if(info.getCurrentRepetition()==2)
		       assertTimeout(Duration.ofMillis(15),()->ArraysPerformance.sortArrays(input));
	     
	}

}
