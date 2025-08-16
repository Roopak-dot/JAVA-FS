package com.tka.may27;

public class Test {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1);
		c1.avgTwo(15, 15);
		
		Calculator c2 = new Calculator();
		System.out.println(c2);
		c2.avgTwo(15,15);
		c1.avgTwo(15, 15);
		
	}

}
