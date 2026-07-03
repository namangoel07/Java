package com.tshaped4;

import java.util.Arrays;

public class ArrayUtils {
public static int[] sortArray(int[] array) {
	int[] sortedArray=array.clone();//Clone the array to avoid modifying the original
	Arrays.sort(sortedArray);
	return sortedArray;
}
}
