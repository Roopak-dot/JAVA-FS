package com.tka.jun6;

public class Job3 implements Runnable {

	@Override
	public void run() {
		this.m1();

	}

	public void m1() {
		System.out.println(" Job started " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Job finished " + Thread.currentThread().getName());
	}

}
