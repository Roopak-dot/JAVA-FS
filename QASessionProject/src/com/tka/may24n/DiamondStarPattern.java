package com.tka.may24n;

public class DiamondStarPattern {

	public static void main(String[] args) {
		int rows = 5; //Half height of diamond
		
		//Upper half
		for(int i = 1; i<=rows; i++) {
			//Spaces before stars
			for(int j = i; j<rows; j++) {
				System.out.print(" ");
			}
			//Stars with space after each
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Lower half
		for(int i=rows-1; i>=1; i--) {
			//Spaces before stars
			for(int j=rows; j>i; j--) {
				System.out.print(" ");
			}
			//Stars with space after each
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
