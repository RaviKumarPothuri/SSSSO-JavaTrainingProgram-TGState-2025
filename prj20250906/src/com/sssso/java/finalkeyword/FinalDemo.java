package com.sssso.java.finalkeyword;

public class FinalDemo {

	public static void main(String[] args) {
		
		/* Final: it is the keyword that is used to make any entity as final.
		 * 
		 * Class: When any class is defined as final. It cannot be inherited.
		 * 
		 * When you want to make any class as only base class and restrict from inheriting.
		 * 
		 * Methods: When any method is to be restricted from overriding.
		 * 
		 * Variables: When any variable is to be the final variable. ie. constant
		 * NOTE: The variable value can be assigned only once.
		 * 
		 *  */
//		
//		SomeClass someClass = new SomeClass();
//		System.out.println("The number is: " + someClass.getNumber());
//		
//		SomeClass someClass1 = new SomeClass(20);
//		System.out.println("The number is: " + someClass1.getNumber());
//		
//		System.out.println(ConstantsUtility.BASE_URL);
		
		FinalClass f1 = new FinalClass();
		System.out.println(f1.getSomeVar());
		f1.showData();
		
	}

}
