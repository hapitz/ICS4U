package com.bayviewglen.daysix;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		String a, b, mixMash;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a word: ");
		a = scanner.nextLine();
		System.out.print("Please enter a word: ");
		b = scanner.nextLine();

		mixMash = a + b + b + a;	// Concatenation -> to join things together
									// + operator joins/Concatenation the string

		System.out.println("mixMash is: " + mixMash);

	}

}
