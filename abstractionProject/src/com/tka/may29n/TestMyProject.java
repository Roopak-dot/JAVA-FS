package com.tka.may29n;

import com.tka.may29.Example;
import com.tka.may29.Abs;
import com.tka.may29.I1;

public class TestMyProject {

	public static void main(String[] args) {
		
		Example e = new Example();
		Abs obj = new Example();
		I1 i1 = new Example();

		e.m1();
		e.m2(0);
		e.m3();
		e.m5();
		e.m6();	
		I1.m4(); //Static method call
	}

}
