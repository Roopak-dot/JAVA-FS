package com.tka.may22;

public class Example {

	// Method overloading example
	public void m1() {
		System.out.println(111);
	}

	public int m1(int a) {
		System.out.println(222);
		return a;
	}

	public int m1(int a, int b) {
		System.out.println(333);
		return a + b;
	}
}
