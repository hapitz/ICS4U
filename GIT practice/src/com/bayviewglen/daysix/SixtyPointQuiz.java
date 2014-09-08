package com.bayviewglen.daysix;

import java.util.Scanner;

public class SixtyPointQuiz {

	public static void main(String[] args) {
		int lowerBound, upperBound;
		int randomNumber;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the lower bound: ");
		lowerBound = scanner.nextInt();
		System.out.print("Please enter the upper bound: ");
		upperBound = scanner.nextInt();

		randomNumber = (int)(((upperBound+1) - lowerBound) * Math.random()) + lowerBound;

		System.out.println("The random number is: " + randomNumber);
	}

}
