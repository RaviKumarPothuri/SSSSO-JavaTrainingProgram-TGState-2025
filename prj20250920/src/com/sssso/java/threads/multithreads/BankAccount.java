package com.sssso.java.threads.multithreads;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private int balance;
	private final ReentrantLock lock = new ReentrantLock();

	public BankAccount(int balance) {
		this.balance = balance;
	}

//	The method that is working on the shared resource is called as "Critical section"
//	The automatic lock imposed is called as Intrinsic lock.
//	When lock is aquired manually is called as External lock. - Reentrant
	public void withdrawl(int amt) throws InterruptedException { // Class level / Method level synchronization
		lock.lock();
		try {
			if (balance >= amt) {
//			synchronized (this) { // Block level synchronization
//				
//			}
				System.out.println(Thread.currentThread().getName() + " is withdrawing " + amt);
				balance -= amt;
				System.out.println("The withdrawl is successful. The current balance is: " + balance);
			} else {
				System.out.println(Thread.currentThread().getName() + "'s Withdrawl failed due to insufficient balance");
			}
		} finally {
			lock.unlock();
		}
	}

	public int getBalance() {
		return balance;
	}

}
