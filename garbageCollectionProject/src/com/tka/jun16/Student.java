package com.tka.jun16;

public class Student {

	int roll;
	
	Student(int r) {
		this.roll = r;
	}
	
	@Override
	public void finalize() {
		System.out.println("B4 deleting object finalize will run");
	}
}
