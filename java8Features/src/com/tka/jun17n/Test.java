package com.tka.jun17n;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		
		LocalDate tdate = LocalDate.of(1992, 10, 05);
		LocalDate bdate = LocalDate.now();
		
		Period age = Period.between(tdate, bdate);
		
		AgeCalculator obj = new AgeCalculator();
		obj.setDob(bdate);
		obj.setToday(tdate);
		obj.setAge(age);
		
		System.out.println("Age is " +obj.getAge().getYears()+ " years " +obj.getAge().getMonths()+ " months " +obj.getAge().getDays()+ " days");

	}

}
