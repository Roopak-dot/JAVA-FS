package com.tka.jun6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool1 {

	public static void main(String[] args) {
		ExecutorService threadService = Executors.newFixedThreadPool(3);
		ExecutorService threadService2 = Executors.newFixedThreadPool(3);

		for(int i = 0; i<7; i++) {
			Job3 job = new Job3();
			threadService.submit(job);
			threadService2.submit(job);
		}
		threadService.shutdown();
		threadService2.shutdown();
	}

}
