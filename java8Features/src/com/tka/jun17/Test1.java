package com.tka.jun17;

public class Test1 {

	public static void main(String[] args) {
		
		MyFunction f1 = new MyFunction() {
			@Override
			public int compute(int n1, int n2) {
				
				return n1+n2;
			}
		};
		
		int sum = f1.compute(10, 20);
		System.out.println("Function 1 : Addition = " +sum);
		
		MyFunction f2 = (n1, n2) -> n1-n2;
		
		int sub = f2.compute(20, 10);
		System.out.println("Function 2 : Subtraction = " +sub);
		
		MyFunction f3 = (n1, n2) -> n1*n2;
		
		int mul = f3.compute(10, 20);
		System.out.println("Function 3 : Multiplication = " +mul);

	}

}
