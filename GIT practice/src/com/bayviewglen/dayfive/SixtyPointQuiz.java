package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SixtyPointQuiz {

	public static void main(String[] args) {
		int shots, saves;
		double savePercentage;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the number of shots: ");
		shots = scanner.nextInt();
		System.out.print("Please enter the number of saves: ");
		saves = scanner.nextInt();

		savePercentage = saves/shots;	// cast occurs before the division

		DecimalFormat formatter = new DecimalFormat("#.###");
		System.out.println("The save percentage for this goalie is: " + formatter.format(savePercentage));

	}

}
