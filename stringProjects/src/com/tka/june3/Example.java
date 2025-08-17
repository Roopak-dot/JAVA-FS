package com.tka.june3;

public class Example {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s2);
		System.out.println(s2.intern());
		System.out.println(s2 == s2.intern());
		System.out.println(s1.equals(s2));

	}

}
