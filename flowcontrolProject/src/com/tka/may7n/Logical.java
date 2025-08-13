package com.tka.may7n;

public class Logical {

	void lastDigit(int n) {
		if (n % 10 == 7) {
			System.out.println("Last digit of no is 7");
		} else {
			System.out.println("Last digit of no is not 7");
		}
	}

	void secondLast(int n) {
		if ((n / 10) % 10 == 2) {
			System.out.println("Second last digit is 2");
		} else {
			System.out.println("Second last digit is not 2");
		}
	}
}
