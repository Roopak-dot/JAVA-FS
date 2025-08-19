package com.tka.jun17;

@FunctionalInterface
public interface I1 {

	int a = 10;
	
	public abstract void m1();
	
	public static void m2() {
		System.out.println(111);
	}
}
