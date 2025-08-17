package com.tka.jun6;

public class SBIBank implements Runnable {

	public static int balance = 1000;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.payNow(200);

		}
	}

	private synchronized static void payNow(int amount) {
		
		System.out.println(Thread.currentThread().getName()+ " wants amount " +amount);
		
		if(amount>balance) {
			System.out.println("Insufficient balance to pay " +amount);
		} else {
			balance -= amount;
			System.out.println("Paid amount " +amount+ " remaining balance " +balance);
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+ " is processing");
			System.out.println("Nidhi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
