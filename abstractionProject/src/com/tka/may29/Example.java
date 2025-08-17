package com.tka.may29;

public class Example extends Abs {

	@Override
	public void m1() {
		System.out.println(111);
	}

	@Override
	public void m5() {
		System.out.println("m5 in Example");
		
	}

	@Override
	public String m6() {
		System.out.println("m6 in Example");
		return "TKA";
	}
	
	
}
