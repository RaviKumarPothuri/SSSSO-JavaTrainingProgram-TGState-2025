package com.sssso.java.threads.impmethods;

public class ThreadDemo {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new MyTask(), "Thread01"); // To provide the thread name while creation.
		Thread t1 = new Thread(new MyTask());
		t1.setName("Thread01"); // When you want to change the thread name using set method.
//		t1.setDaemon(true); // The thread will be converted as Daemon.
		t1.setPriority(3); // This will increase the chance of execution frequently.
		System.out.println(t1.getPriority());
		System.out.println("is Daemon: " + t1.isDaemon());
		t1.start();
		t1.interrupt(); // Stop the thread execution.
	}

}
