package com.tka.jun6;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread started");
		System.out.println(Thread.currentThread().getName());
		
		Job2 j1 = new Job2();
		Thread t1 = new Thread(j1);
		t1.setName("Amazon");
		t1.start();
		
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("Santoshi");
			
			Thread.sleep(800);
		}
		
		System.out.println("Main thread completed");

	}

}
