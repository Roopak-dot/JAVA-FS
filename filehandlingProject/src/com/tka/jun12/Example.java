package com.tka.jun12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\dell\\Desktop\\filehandling\\Student.ser";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Student s = null;
		
		fos = new FileOutputStream(filepath);
		oos = new ObjectOutputStream(fos);
		s = new Student(10, "Monu", "m@31223");
		
		oos.writeObject(s);
		System.out.println("Object written to file successfully");

		oos.flush();
		oos.close();
		fos.close();
	}

}
