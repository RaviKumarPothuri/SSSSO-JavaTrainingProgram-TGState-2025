package com.sssso.java.abstraction.sealed;

public class SealedClassDemo {

	public static void main(String[] args) {
		
		/*
		 * Sealed classes: The concept of restricting the inheritance to specific classes.
		 * 
		 * Every inherited class (child class) must be provided with sealed, non-sealed 
		 * or final class.
		 * 
		 * Child sealed class can restrict other class from inheriting it.
		 * Child non-sealed class can be inherited by any other class.
		 * Child final class cannot be further inherited. 
		 * 
		 */
		
		
		Lion l1 = new Lion();
		Tiger t1 = new Tiger();
		

	}

}
