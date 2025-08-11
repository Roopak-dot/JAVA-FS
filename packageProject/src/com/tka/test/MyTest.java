package com.tka.test;

public class MyTest {

	public static void main(String[] args) {
		
		A var = new A();
		com.tka.controller.A var1 = new com.tka.controller.A();
		
		
		System.out.println(var1.p);
		
		var1.p = 30;
		System.out.println(var1.p);
		
		var.m1();
		var1.m1();

	}

}
