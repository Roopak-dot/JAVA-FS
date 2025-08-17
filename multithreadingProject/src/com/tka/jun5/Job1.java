package com.tka.jun5;

public class Job1 extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Pratiksha");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
