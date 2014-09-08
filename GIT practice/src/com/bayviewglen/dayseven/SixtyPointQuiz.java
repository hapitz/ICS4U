package com.bayviewglen.dayseven;

import java.util.Scanner;

public class SixtyPointQuiz {

	public static void main(String[] args) {
		String word, newWord;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		word = scan.nextLine();

		newWord = "K" + word.substring(1,word.length()-1) + "K";

		System.out.println(newWord);
	}

}
