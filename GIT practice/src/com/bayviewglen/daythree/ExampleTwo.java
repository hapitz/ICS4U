package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double x, y, z;
		
		
		System.out.print("Please enter the length of the first side of a right angled triangle: ");
		x = scanner.nextDouble();
		
		System.out.print("Please enter the length of the second side of a right angled triangle: ");
		y = scanner.nextDouble();

		 z = Math.sqrt(x*x + y*y);
		
		System.out.println("The length of the third side is: " + z);
		
		scanner.close();
	}

}
