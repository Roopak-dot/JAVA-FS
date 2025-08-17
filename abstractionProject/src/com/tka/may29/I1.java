package com.tka.may29;

public interface I1 {

	void m1();
	int m2(int a);
	
	default void m3() {
		System.out.println("Default method m3 in I1");
	}
	
	static void m4( ) {
		System.out.println("Static method m4 in I1");
	}
}
