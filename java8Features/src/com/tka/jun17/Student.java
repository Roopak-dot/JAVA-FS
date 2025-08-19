package com.tka.jun17;

import java.time.LocalDateTime;

public class Student {

	private int roll;
	private String Name;
	LocalDateTime doc;
	
	public Student() {
		super();
	}
	public Student(int roll, String name, LocalDateTime date) {
		super();
		this.roll = roll;
		Name = name;
		this.doc = date;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public LocalDateTime getDoc() {
		return doc;
	}
	public void setDoc(LocalDateTime date) {
		this.doc = date;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", Name=" + Name + "]";
	}
	
	
}
