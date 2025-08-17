package com.tka.may28n;

//Implementing the interface
class Dog implements Animal {
 
	@Override
	public void sound() {
     System.out.println("Dog barks");
 }
 
	@Override
	public void eat() {
     System.out.println("Dog eats bones");
 }
}
