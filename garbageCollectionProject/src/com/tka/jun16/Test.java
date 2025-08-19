package com.tka.jun16;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(10);
		Student s2 = s1;
		
		System.out.println(s1.roll);
		s1 = null;
		s2 = null;
		System.gc();

	}

}
