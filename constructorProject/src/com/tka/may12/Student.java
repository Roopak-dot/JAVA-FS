package com.tka.may12;

public class Student {

	int roll;
	String name;
	int marks;

	// Para constructor

	Student(int r, String n, int m) {
		roll = r;
		name = n;
		marks = m;

	}

	void display() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
	}
}
