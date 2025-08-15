package com.tka.may22;

public class Test {

	public static void main(String[] args) {

		// Method overloading example
		Example e = new Example();

		e.m1(); // 111
		System.out.println(e.m1(10)); // 222, 10
		System.out.println(e.m1(10, 20)); // 333, 30

		System.out.println("End of main");
	}
}
