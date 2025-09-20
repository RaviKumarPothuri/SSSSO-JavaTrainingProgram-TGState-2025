package com.sssso.java.threads;

public class TaskPerformerRunnable implements Runnable {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println("The thread name: " + tName);
		doTask();
	}

	public void doTask() {
		System.out.println("Executing the do task.");
	}

}
