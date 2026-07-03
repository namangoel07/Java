package com.tshaped7;
import java.util.Arrays;

public class ArraysPerformance {
	
public static int[] sortArrays(int[] array) {
	
	for(int i=0;i<10000;i++) {
		
		Arrays.sort(array);	//sort the array
		
		}
	
	return array;
}
}
