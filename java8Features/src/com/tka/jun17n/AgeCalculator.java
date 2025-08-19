package com.tka.jun17n;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	LocalDate dob;
	LocalDate today;
	Period age;
	
	public AgeCalculator() {
		super();
	}

	public AgeCalculator(LocalDate dob, LocalDate today, Period age) {
		super();
		this.dob = dob;
		this.today = today;
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public Period getAge() {
		return age;
	}

	public void setAge(Period age) {
		this.age = age;
	}
	
	
}
