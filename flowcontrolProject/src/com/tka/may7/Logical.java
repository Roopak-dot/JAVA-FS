package com.tka.may7;

public class Logical {

	void checkEvenOdd1(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " Number is even");
		} else {
			System.out.println(n + " Number is odd");
		}
	}

	void checkEvenOdd2(int n) {

		if (n % 2 == 1) {
			System.out.println(n + " Number is odd");
		} else {
			System.out.println(n + " Number is even");
		}
	}

	void checkEvenOdd3(int n) {

		if ((n & 1) == 1) {
			System.out.println(n + " Number is odd");
		} else {
			System.out.println(n + " Number is even");
		}
	}

	void checkEvenOdd4(int n) {

		if (n % 2 != 0) {
			System.out.println(n + " Number is odd");
		} else {
			System.out.println(n + " Number is even");
		}
	}

	void checkPositiveNegative(int n) {

		if (n > 0) {
			System.out.println("Number is positive");
		} else if (n < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

	void checkAge(int jay, int viru, int basanti) {

		if (jay > viru && jay > basanti) {
			System.out.println("jay is older");
		} else if (jay < viru && jay < basanti) {
			System.out.println("jay is younger");
		} else {
			System.out.println("Invalid input");
		}
	}
}
