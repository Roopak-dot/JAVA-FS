package com.tka.may24;

public class LogicalProgramming {

	public static void pattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
