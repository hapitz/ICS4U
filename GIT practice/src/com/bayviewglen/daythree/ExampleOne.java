package com.bayviewglen.daythree;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		//String s = "Hello";
		//s = "Goodbye";
		
		Scanner scanner = new Scanner(System.in);
		String firstName, lastName;
		
		
		/*System.out.print("Please enter your first name: ");
		firstName = scanner.nextLine();
		
		System.out.print(firstName + ", please enter your last name: ");
		lastName = scanner.nextLine();*/
		
		System.out.print("Please enter your name: ");
		firstName = scanner.next();	    // next takes up to the deliminitor (space)
		lastName = scanner.nextLine();  // nextLine takes up to the enter key - and throws the enter key away 
										// - removes it from the buffer (next does now remove it from the buffer
		
		
		System.out.println("It\'s nice to meet you " + firstName + " " + lastName);

	}

}
