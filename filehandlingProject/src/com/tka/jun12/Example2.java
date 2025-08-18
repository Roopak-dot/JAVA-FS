package com.tka.jun12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String filepath = "C:\\Users\\dell\\Desktop\\filehandling\\Student.ser";

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Student s = null;
		
		fis = new FileInputStream(filepath);
		ois = new ObjectInputStream(fis);
		
		s = (Student) ois.readObject();
		System.out.println(s.getRoll()+ " " +s.getName()+ " " +s.getPassword());
	}

}
