package com.bayviewglen.daythree;

import java.util.Scanner;

public class Homework2_2 {

	public static void main(String[] args) {
		double x1, y1, x2, y2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter P(x1, y1): ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		
		System.out.print("Please enter P(x2, y2): ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		double length = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
		
		System.out.println("The length of the line defined by the points P1("+x1+", "+y1+") and P2("+x2+", "+y2+") is " + length);
	}

}
