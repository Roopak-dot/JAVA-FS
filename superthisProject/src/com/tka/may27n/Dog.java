package com.tka.may27n;

public class Dog extends Animal {

	String name = "Dog";
	
	Dog() {
		// Calling parent constructor using super()
		super();
		System.out.println("Child class constructor called");

	}

	void printNames() {
		// super keyword refers to parent class variable
		System.out.println("Parent name: " + super.name);

		// this keyword refers to current class variable
		System.out.println("Child name: " + this.name);
	}

	void display() {
		// Overriding parent method
		System.out.println("I am a Dog");
	}

	void showBoth() {
		// Call parent class method using super
		super.display();

		// Call child class method using this
		this.display();
	}
}
