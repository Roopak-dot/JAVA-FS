package com.tka.jun6;

public class Job2 implements Runnable {
	
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Nidhee");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
