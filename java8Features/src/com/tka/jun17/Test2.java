package com.tka.jun17;

import java.time.LocalDateTime;

public class Test2 {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		
		Student s1 = new Student();
		s1.setRoll(11);
		s1.setName("Yash");
		s1.setDoc(date);
		
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getDoc());

	}

}
