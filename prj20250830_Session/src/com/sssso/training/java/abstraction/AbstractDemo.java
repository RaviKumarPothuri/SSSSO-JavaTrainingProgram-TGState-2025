package com.sssso.training.java.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		/*
		 * Abstraction: It is the mechanism that exposes only the required behavior
		 * and properties of an object.
		 * 
		 * The class defined with the abstract keyword will be the abstract class.
		 * 
		 * Abstract class cannot be instantiated. The class must be inherited.
		 * The class which inherits the abstract class is called as Concrete class.
		 * 
		 * Every method that needs implementation in concrete class must be defined with 
		 * abstract method.
		 * 
		 * Multiple inheritance is not possible.
		 * 
		 */	
		
		MyUPIClass upiPayment = new MyUPIClass();
		upiPayment.payment();
		upiPayment.parentMethod();
		
		MyCreditPayment ccPayment = new MyCreditPayment();
		ccPayment.payment();
		ccPayment.parentMethod();
	}

}
