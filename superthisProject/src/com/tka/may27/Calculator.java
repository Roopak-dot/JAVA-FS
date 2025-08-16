package com.tka.may27;

public class Calculator {

	int addTwo(int n1, int n2) {
		
		return n1+n2;
		
	}
	
	int avgTwo(int n1, int n2) {
		
		System.out.println(this);
		int sum = this.addTwo(n1, n2);
		
		int avg = sum/2;
		return avg;
	}
}
