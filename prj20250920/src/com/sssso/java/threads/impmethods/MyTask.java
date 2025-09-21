package com.sssso.java.threads.impmethods;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + ": Running...");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
