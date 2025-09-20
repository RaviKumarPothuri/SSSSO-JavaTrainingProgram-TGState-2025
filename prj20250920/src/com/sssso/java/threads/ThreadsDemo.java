package com.sssso.java.threads;

import java.lang.Thread.State;

public class ThreadsDemo {

	public static void main(String[] args) {

		/*
		 * Process: A Program/Application that is executing. Eg: Word, Excel.
		 * 
		 * Thread: It is the part of the Process. (The smallest unit of execution within
		 * the process)
		 * 
		 * Multi-Processing: It is a system where there will be more than one processor.
		 * 
		 * Multi-Threading: The capability to create multiple threads in a single process.
		 * 
		 * The threads are basically used when multiple tasks are to be executed concurrently.
		 * 
		 * How to create threads?
		 * 
		 * 1. By extending Thread class.
		 * 		When the class is not going to involve in inheritance.
		 * 2. By implementing Runnable interface.
		 * 		When the class is may go for inheritance.
		 * 
		 * join() - To let the thread to wait till its termination.
		 * 
		 * Life-cycle of Thread:
		 * 1. New state
		 * 2. Active state (Runnable state/Running state)
		 * 3. Waiting/Block state
		 * 4. Timed wait state
		 * 5. Terminated state
		 * 
		 */
		
		System.out.println("Start of Main");
		
		State tpState = null;
		TaskPerformer tp = new TaskPerformer();
		System.out.println("tp is created...");
		tpState = tp.getState();
		System.out.println("tpState: " + tpState);
		tp.start();
		tpState = tp.getState();
		System.out.println("tpState: " + tpState);
		 
//		Implementing using the class that implements runnable interface.
		TaskPerformerRunnable tpr = new TaskPerformerRunnable();
		Thread t2 = new Thread(tpr);
		t2.start();
		
//		Implementing using the direct object creation of class that implements runnable.
		Thread t3 = new Thread(new TaskPerformerRunnable());
		t3.start();
		
//		Implementing thread using the lambda expression.
		Thread t4 = new Thread(() -> {
			System.out.println("Executing the do task.");
		});
		t4.start();

		try {
			tp.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tpState = tp.getState();
		System.out.println("tpState: " + tpState);
		
		System.out.println("End of main");
		
		
	}

}
