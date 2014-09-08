package com.bayviewglen.daytwo;

public class ExamplerTwo {

	public static void main(String[] args) {
		double x = 5;
		int y = 6;
		int z = 5;
		
		//x = 3.4;
		//x = y;
		//y = (int) x;	// casted x as an int before it assigned it to y
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x/y);	// double divided by an int
		System.out.println(z/y);	// int divided by an int
		
		// when doing math with only ints as the operands the answer is represented as an int
		// when doing math and one of the operands is a double we will get a double as the answer
	}

}
