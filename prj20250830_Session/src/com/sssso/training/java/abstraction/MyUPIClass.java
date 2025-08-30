package com.sssso.training.java.abstraction;

public class MyUPIClass extends MyAbstractClass {
	
	@Override
	public void parentMethod() {
		System.out.println("Implementation from UPI class");
	}

	@Override
	public void payment() {
		System.out.println("UPI payment implementation");
	}


}
