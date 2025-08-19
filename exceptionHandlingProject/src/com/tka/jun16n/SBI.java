package com.tka.jun16n;

public class SBI extends Gpay {

	@Override
	public void payNow(int amount) throws ArithmeticException {
		
		System.out.println("SBI bank pay now method");
		System.out.println(4/0);
	}
}
