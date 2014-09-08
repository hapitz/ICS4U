package com.bayviewglen.daythree;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Homework2_12 {

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		
		Scanner s = new Scanner(System.in);
		double money = s.nextDouble();
		
		
		
		
		System.out.println(formatter.format(money));

	}

}
 