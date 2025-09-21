package com.sssso.java.threads.multithreads;

public class MultiThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		BankAccount sbiAccount = new BankAccount(100);
		
		Runnable withdrawlTask =  () -> {
			try {
				sbiAccount.withdrawl(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
//		Race condition: The condition where the shared resource is used inappropriately.
		
		Thread t1 = new Thread(withdrawlTask, "Raghav");
		Thread t2 = new Thread(withdrawlTask, "Kumar");
		t1.start();
		Thread.sleep(10000);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(sbiAccount.getBalance());
		
	}

}
