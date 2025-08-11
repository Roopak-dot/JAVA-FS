package com.tka.test;

import com.tka.controller.A;

public class MyTest {

	public static void main(String[] args) {
	
		A var = new A();
		System.out.println(var.p);
		
		var.p = 30;
		System.out.println(var.p);
		
		var.m1();

	}

}
