package com.tka.may6;

public class Ternary1 {
	
	int a = 5;
	int b = 7;
	int c = 3;
	int d = 4;
	
	int result = (a>b)?((b>c)?10:20):((d>c)?50:40);
	
	public static void main(String[] args) {
		
		Ternary1 v1 = new Ternary1();
		System.out.println(v1.result);
	}
}
