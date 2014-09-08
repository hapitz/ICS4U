package com.bayviewglen.daysix;

import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String word, lastTwo, threeTimes;
		System.out.print("Please enter a word: ");
		word = scanner.nextLine();
		
		lastTwo = word.substring(word.length()-2);
		threeTimes = lastTwo + lastTwo + lastTwo;
		
		System.out.println("Here it is: " + threeTimes);

	}

}
