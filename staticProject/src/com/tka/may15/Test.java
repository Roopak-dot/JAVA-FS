package com.tka.may15;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Jay", "TKA");
		Student s2 = new Student(2, "Veeru", "TKA");
		Student s3 = new Student(1, "Ashok", "TKA");

		System.out.println(s1.roll);
		System.out.println(s1.cname);
		s1.cname = "JBK";
		Student.cname = "PUNE";
		System.out.println(Student.cname);
		System.out.println(s2.cname);
		System.out.println(s3.cname);
	}
}