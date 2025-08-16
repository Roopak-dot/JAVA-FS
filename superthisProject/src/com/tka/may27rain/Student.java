package com.tka.may27rain;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	
	public Student() {
		System.out.println("Default constructor called");
	}
	
	//Constructor chainning
	public Student(int roll) {
		this();
		this.roll = roll;
	}
	public Student(int roll, String name) {
		this(roll);
		this.name = name;
	}
	public Student(int roll, String name, int age) {
		this(roll, name);
		this.age = age;
	}
	//
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
