package com.sssso.java.threads;

public class TaskPerformer extends Thread {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println("The thread name: " + tName);
		State state = Thread.currentThread().getState();
		System.out.println("tpState: " + state);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		state = Thread.currentThread().getState();
		System.out.println("tpState: " + state);
//		try {
//			Thread.currentThread().wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		state = Thread.currentThread().getState();
//		System.out.println("tpState: " + state);
		doTask();
	}

	public void doTask() {
		System.out.println("Executing the do task.");
	}

}
