package com.bayviewglen.dayfive;

import java.text.DecimalFormat;

public class RandomTest {

	public static void main(String[] args) {
	
		
		int areaCode = (int)(900 * Math.random()) + 100;
		int nnx = (int)(1000 * Math.random());
		int lastFour = (int)(10000 * Math.random());
		
		DecimalFormat formatter = new DecimalFormat("0000");
		DecimalFormat formatter2 = new DecimalFormat("000");
		
		System.out.println("(" + areaCode + ")" + formatter2.format(nnx) + "-" + formatter.format(lastFour));
		
		
		
		
		/*
		
		double x = 10*Math.random();
		System.out.println(x);
		
		x = 10*Math.random();
		System.out.println(x);
		
		x = 10*Math.random();
		System.out.println(x);
		
		int x = 10*Math.random();
		System.out.println(x);	// area code is between 100 and 999
		
		x = 10*Math.random();
		System.out.println((int)x+1); // cast this one as an int and now we have 0-9 add 1 to this and we shift every # up by 1 and get 1 - 10
		
		x = 10*Math.random();
		System.out.println((int)x);	// cast this one as an int and now we have 0-9
		*/
		
		/*
		int areaCode = (int)(900 * Math.random()) + 100;
		int nnx = (int)(1000 * Math.random());
		int lastFour = (int)(10000 * Math.random());
		
		DecimalFormat formatter = new DecimalFormat("0000");
		DecimalFormat formatter2 = new DecimalFormat("000");
		
		System.out.println("(" + areaCode + ")" + formatter2.format(nnx) + "-" + formatter.format(lastFour));
*/
	}

}
