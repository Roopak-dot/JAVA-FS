package com.tka.may24n;

public class Pattern {

	public static void pattern(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch +" ");
				ch++;
			}

			System.out.println();
		}
	}
}
