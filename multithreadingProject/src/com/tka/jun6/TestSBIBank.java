package com.tka.jun6;

public class TestSBIBank {

	public static void main(String[] args) {
		
		SBIBank sbi1 = new SBIBank();
		Thread t1 = new Thread(sbi1);
		
		t1.setName("Amazon");
		t1.start();
		
		SBIBank sbi2 = new SBIBank();
		Thread t2 = new Thread(sbi2);
		
		t2.setName("Myntra");
		t2.start();
	}
}
