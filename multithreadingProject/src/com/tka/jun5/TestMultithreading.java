package com.tka.jun5;

public class TestMultithreading {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread started");
		System.out.println(Thread.currentThread().getName());
		
		Job1 t1 = new Job1();
		t1.setName("Amazon");
		t1.start();
		
		Job1 t2 = new Job1();
		t2.setName("Myntra");
		t2.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("Radhika");
			
			Thread.sleep(500);
		}
		
		System.out.println("Main thread completed");

	}

}
