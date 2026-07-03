package com.tshaped8;

import java.util.Arrays;

public class ManipulateString {
public String reverseString(String str) {
	char[] charArray=str.toCharArray();
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		char ch=charArray[left];
		charArray[left]=charArray[right];
		charArray[right]=ch;
		left++;
		right--;
	}
   return new String(charArray);
}
public int[] sortingArray(int[] array) {
	Arrays.sort(array);
	return array;
}
}
