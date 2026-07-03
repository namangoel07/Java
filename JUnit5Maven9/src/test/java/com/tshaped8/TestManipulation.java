package com.tshaped8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TestManipulation {

	ManipulateString task;
	@BeforeEach
	void init() {
		task=new ManipulateString();
	}
	@Nested
	class TestReverseString{
		@Test
		void testReverseString_OneWord() {
			String str="Java";
			assertEquals("avaJ",task.reverseString(str));
		}
		@Test
		void testReverseString_MultipleWords() {
			assertEquals("ysae si avaJ",task.reverseString("Java is easy"));
		}
	}
	@Nested
	class TestArrays{
		@Test
		void testUnsortedArray() {
			int[] unsorted= {4,2,1,0};
			int[] expected= {0,1,2,4};
			int[] actual=task.sortingArray(unsorted);
			assertArrayEquals(expected,actual);
		}
		@Test
		void testSortedArrays() {
			int[] sorted= {2,4,6,8,10};
			int[] expected= {2,4,6,8,10};
			int[] actual=task.sortingArray(sorted);
			assertArrayEquals(expected,actual);
			
		}

	}
	
}
