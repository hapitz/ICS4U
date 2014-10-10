package com.bayviewglen.nqueens;

import java.util.Scanner;
import java.util.Stack;

public class nQueensNew {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, welcome to nQueens.");
		System.out.println("Please enter a value for n, which the number of queens and the NxN size of the board. ");
		int n = scanner.nextInt();
		
		int numQueens = n;
		
		String[][] board = new String[n][n]; 
		
		for(int row = 0; row<n; row++){
			for(int col = 0; col<n; col++){
				board[row][col] = "X";
			}
		}
		Stack<Queen> queenStack = new Stack<Queen>();
		
		int col = 0;
		for(int row = 0; row<n; row++){
			
			
			
		}
		

		
		
	}

}
