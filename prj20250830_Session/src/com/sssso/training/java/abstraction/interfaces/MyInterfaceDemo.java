package com.sssso.training.java.abstraction.interfaces;

public class MyInterfaceDemo {

	public static void main(String[] args) {

		/*
		 * Interface: These will define the blueprint of the methods that need to be
		 * implemented by the a class.
		 * 
		 * Interface can be implemented using the "interface" keyword instead of class.
		 * 
		 * The interface that consists of only one method definition is known as
		 * "Single Abstract Method (SAM)" interface
		 * 
		 * Every SAM interface will be called as Functional Interface.
		 * NOTE: The @FunctionalInterface marker annotation is used to mark any interface as 
		 * Functional Interface. It will restrict from accidental definition of abstract methods.
		 * 
		 * In Interfaces we don't need to mention the abstract keyword. By default all the methods
		 * are abstract.
		 * 
		 * We can mention multiple interfaces separated by comma in the class.
		 * 
		 * One interface an extend other interfaces and abstract classes as well.
		 * 
		 */
		MyInterface cObj = new MyClass();
		cObj.doImplementation();

	}

}
