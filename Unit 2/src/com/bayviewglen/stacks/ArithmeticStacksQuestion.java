package com.bayviewglen.stacks;

import java.util.Scanner;
import java.util.Stack;

public class ArithmeticStacksQuestion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("Please enter a postfix equation: ");
		String expression = scanner.nextLine();

		String[] values = expression.split(" ");
		Stack<Integer> stack = new Stack<Integer>();


		for(int i = 0; i<values.length; i++){
			if(values[i].equals("*") || values[i].equals("-") || values[i].equals("+") || values[i].equals("/")){
				int num = stack.pop();
				int num2 = stack.pop();

				if(values[i].equals("*")){
					stack.push(num*num2);
				}else if(values[i].equals("/")){
					stack.push(num/num2);
				}else if(values[i].equals("+")){
					stack.push(num+num2);
				}else if(values[i].equals("-")){
					stack.push(num-num2);
				}
			}else{
				stack.push(new Integer(values[i]));
			}

		}

System.out.println("The answer is: " + stack.pop());

	}

}
