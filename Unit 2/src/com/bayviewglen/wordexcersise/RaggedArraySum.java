package com.bayviewglen.wordexcersise;

public class RaggedArraySum {

	public static void main(String[] args) {

		
		int[][] raggedArray = {
				{1, 2, 3, 4, 5},
				{1, 2, 3, 4},
				{1, 2, 3},
				{1, 2,},
				{1},

		};
		
		int sum = 0;
		
		for (int i=0; i<raggedArray.length; ++i){
			for (int j=0; j<raggedArray[i].length; ++j){
				sum += raggedArray[i][j];
			}
		}
		
		System.out.println("THE SUM IS " + sum);
		

		for (int i=0; i<raggedArray.length; ++i){
			for (int j=0; j<raggedArray[i].length; ++j){
				System.out.print(raggedArray[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
