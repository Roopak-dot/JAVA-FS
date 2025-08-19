package com.tka.jun16;

public class Test {

	public static void main(String[] args) {

		int num1 = 56;
		int num2 = 7;

		if (num2 == 7) {

			MyException e = new MyException("You are cannot / by seven");
			throw e;
		} else {
			System.out.println(num1 / num2);
		}

	}

}
