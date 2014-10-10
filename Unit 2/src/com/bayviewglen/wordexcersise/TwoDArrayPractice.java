package com.bayviewglen.wordexcersise;

public class TwoDArrayPractice {

	public static void main(String[] args) {

		int[][] array1 = {
				{10, 11, 12, 13},
				{14, 15, 16, 17},
				{18, 19, 20, 21},
				{22, 23, 24, 25},
				{26, 27, 28, 29},
		};


	}

	public void switcher(int col1, int col2, int[][] x){
		int temp = 0;
		for(int i= 0; i<5; i++){
			temp= x[i][col1];
			x[i][col1] = x[i][col2];
			x[i][col2] = temp;
			
			
		}

	}
	
	public static void display(int[][] arr){
		for(int i=0; i<arr.length; ++i){
			for(int j = 0; j<arr[0].length; ++j){
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
			
		}
	}

}