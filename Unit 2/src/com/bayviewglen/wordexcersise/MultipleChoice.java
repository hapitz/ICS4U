package com.bayviewglen.wordexcersise;

public class MultipleChoice {

	public static void main(String[] args) {

		char[][] arr = {
				{'C', 'C', 'D', 'E', 'B', 'A', 'A', 'E', 'C', 'D'},
				{'A', 'B', 'E', 'D', 'A', 'A', 'C', 'E', 'B', 'A'},
				{'A', 'C', 'C', 'E', 'B', 'E', 'A', 'B', 'C', 'D'},
				{'B', 'E', 'D', 'A', 'B', 'E', 'E', 'C', 'C', 'A'},
				{'A', 'A', 'D', 'E', 'E', 'A', 'A', 'C', 'C', 'D'},
				{'C', 'C', 'A', 'D', 'B', 'C', 'B', 'E', 'B', 'D'},
				{'A', 'B', 'D', 'E', 'C', 'A', 'A', 'A', 'C', 'D'},
				{'C', 'C', 'D', 'E', 'B', 'D', 'A', 'E', 'D', 'D'},
				{'C', 'C', 'D', 'E', 'B', 'D', 'A', 'E', 'D', 'D'},
				{'C', 'A', 'D', 'E', 'B', 'D', 'B', 'E', 'C', 'D'},

		};

		char[] answers = {'D', 'B', 'C', 'E', 'F', 'E', 'B', 'A', 'C', 'C'};

		int[] scores = new int[10];

		for (int i=0; i<arr.length; ++i){
			for (int j=0; j<answers.length; ++j){
				if (arr[i][j] == answers[j]){
					scores[i]++;
				}

			}
		}
		
		for (int i=0; i<scores.length; ++i){
			System.out.println("Student " + (i+1) + " got " + scores[i] + " correct.");
		}
	}



}


