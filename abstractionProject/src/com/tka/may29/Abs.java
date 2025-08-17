package com.tka.may29;

public abstract class Abs implements I1 {
	
	@Override
	public int m2(int a) {
		System.out.println("m2 in abs");
		return 10;
	}

	public abstract void m5();
	public abstract String m6();
}
