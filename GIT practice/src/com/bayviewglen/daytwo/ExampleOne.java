package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// upper and lower case are different in java (case-sensitive)
														// Scanner and scanner are not the same thing
														// Scanner is the name of the class and scanner is the name of the variable
														// developers choose the variable, class, package, etc names -> they need to make sense (well they don't NEED to)
		
		int x, y;
		int sum, difference;
		
		System.out.print("Please enter a number: ");
		x = scanner.nextInt();
		
		System.out.print("Please enter a another number: ");
		y = scanner.nextInt();
		
		sum = x + y;
		difference = x - y;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The difference is: " + difference);
	}

}
