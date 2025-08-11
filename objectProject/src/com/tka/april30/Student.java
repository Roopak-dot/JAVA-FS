package com.tka.april30;

public class Student {
	
	int roll = 1;
	String name = "Veeru";
	int marks = 88;
	
	void m1() {
		System.out.println(111);
		Student s1 = new Student();
		System.out.println(s1);
		s1.m2();
	}
	
	void m2() {
		System.out.println(222);
		Student s1 = new Student();
		System.out.println(s1);
		s1.m1();
	}
}
