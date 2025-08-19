package com.tka.jun16n;

public class TestGpay {

	public static void main(String[] args) {
		
		Gpay obj = new SBI();
		try {
		obj.payNow(100);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("WAIT WE ARE WORKING ON SERVER");
		}
		
	}

}
