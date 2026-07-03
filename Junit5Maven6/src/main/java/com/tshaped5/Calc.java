package com.tshaped5;

public class Calc {
public int divide(int numerator,int denominator) {
	if(denominator==0) {
		throw new ArithmeticException("Cannot divide by zero");
	}
	return numerator/denominator;
}
}
