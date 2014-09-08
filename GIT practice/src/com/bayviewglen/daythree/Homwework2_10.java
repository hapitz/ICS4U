package com.bayviewglen.daythree;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homwework2_10 {

	public static void main(String[] args) {
		double a, b, c, s;
		double area;
		
		DecimalFormat formatter = new DecimalFormat(".##");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a, b, c: ");
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		s = (a + b + c)/2;
		
		area  = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The ara of the triangle is " + formatter.format(area));

	}

}
