package com.bayviewglen.nqueens;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class nQueens {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, welcome to nQueens.");
		System.out.println("Please enter a value for n, which the number of queens and the NxN size of the board. ");
		int n = scanner.nextInt();

		int filled = 0;
		int boardSize = n;
		int numQueens = n;

		Stack<Queen> queenStack = new Stack<Queen>();
		int col = 0;
		for(int row = 0; row < n; row++){
			col=0;
			if(filled>0 && queenStack.peek().getCol() == col){
				if(col ==n-1){
					queenStack.pop();
					row--;
					col++;
				}else{
				col++;
				}
			}
			if(filled>0 && Math.abs(col-queenStack.peek().getCol()) == Math.abs(row - queenStack.peek().getRow())){
				if(col ==n-1){
					queenStack.pop();
					row--;
					col++;
				} 
				else{
				col++;
				}
			}
			queenStack.push(new Queen(row,col));
			filled++;
		}

		int size = queenStack.size();	
		ArrayList<Queen> queenList = new ArrayList<Queen>();
		for(int i = 0; i<size; i++){
			queenList.add(queenStack.pop());
		}

		for(int i=0; i<queenList.size(); i++){
			System.out.println(queenList.get(i).getRow() + ", " + queenList.get(i).getCol());
		}






	}

}
