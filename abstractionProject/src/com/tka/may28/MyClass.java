package com.tka.may28;

public class MyClass implements MyInterface {

	@Override
	public void m1(int a) {
		System.out.println(a);
	}

	@Override
	public void m2() {
		System.out.println(222);
	}

	@Override
	public void m3(int a, int b) {
		System.out.println(a + b);
	}
	
	void m4() {
		System.out.println("m4");
	}
}
