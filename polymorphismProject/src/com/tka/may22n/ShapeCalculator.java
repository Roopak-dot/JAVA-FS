package com.tka.may22n;

public class ShapeCalculator {

	//Area of circle
	double area(double rad) {

		double pi = 3.14;
		double area = pi * rad * rad;
		System.out.println(area);
		return area;
	}

	//Area of rectangle
	double area(double length, double breadth) {

		double area = length * breadth;
		System.out.println(area);
		return area;
	}

	//Area of triangle
	double area(int base, int height) {
		
		double area = (double)1/2*base*height;
		System.out.println(area);
		return area;
	}
}
