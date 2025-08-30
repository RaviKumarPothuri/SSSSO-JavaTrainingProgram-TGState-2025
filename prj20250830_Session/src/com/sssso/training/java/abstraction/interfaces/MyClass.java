package com.sssso.training.java.abstraction.interfaces;

public class MyClass implements MyInterface, Interface2 {

	@Override
	public void doImplementation() {
		System.out.println("This is the implementation");
		
	}

	@Override
	public void myImplementation() {
		System.out.println("This is the implementation2");
		
	}

}
