package com.sssso.java.generic;

public class GenericDemo {

	public static void main(String[] args) {
		
		/*
		 * Generics: it is the concept that will be used when multiple types are to be used
		 * with single entity.
		 * 
		 * T - Type
		 * K, V - Key and Value
		 * ? - Wildcard
		 * 
		 * 
		 */
		
		
		AddClass<Integer> addC = new AddClass(10,20);
		System.out.println(addC.showAddValue(10, 20));
		
		AddClass<String> addS = new AddClass("Hello", "World");
		System.out.println(addS.showAddValue("Hello", "World"));

	}

}
