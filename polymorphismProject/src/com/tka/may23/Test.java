package com.tka.may23;

public class Test {

	public static void main(String[] args) {

		// Dynamic Dispatch / Late Binding / Loose Coupling
		Parent p = new Child(); // Upcasting
		p.marrige();
		
		

		// Child jay = new Child();
		// jay.property();
		// System.out.println(jay.money());
		// jay.marrige();
	}

}
