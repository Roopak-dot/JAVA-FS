package com.tka.jun12;

import java.io.Serializable; //Mark up interface

//Entity class / POJO class
public class Student implements Serializable {

	private int roll;
	private String name;
	private transient String password;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.password = password;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
