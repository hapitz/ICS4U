package com.bayviewglen.daysix;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		String tagName, innerHTML;
		String element;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the tag name: ");
		tagName = scanner.nextLine();
		System.out.print("Please enter the innerHTML for this element: ");
		innerHTML = scanner.nextLine();
		
		element = "<" + tagName + ">" + innerHTML + "</" + tagName + ">";
		
		System.out.println("The element you created is: " + element);
 		
		scanner.close();
	}

}
