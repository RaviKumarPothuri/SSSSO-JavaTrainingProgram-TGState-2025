package com.sssso.training.java.methods;

import java.util.Scanner;

public class MethodsDemo {
	
	Scanner scr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
/*		Methods: A collection statements that are grouped together with a single name.
 * 		Use: Reusability.
 * 		Signature: The syntax to define and execute a method.
 * 			[accessModifier] [static] <returnType> <methodName>([Parameter1, Parameter2, .., ParameterN]) {
 * 				statements;
 * 			}
 */
		
		/*
		 * Problem: Print a greeting with user name.
		 * Hello, <Name>
		 */
		
		MethodsDemo md = new MethodsDemo();
		String name = "Ravi";
		md.greetUser(name);
		
		name = "kumar";
		md.greetUser(name);
		
		name = "varma";
		md.greetUser(name);
		
		int num1=20, num2=20;
		int result = md.addNumbers(num1, num2);
		System.out.println("The sum is " + result);

	}
	
	public void greetUser(String name){
		System.out.println("Hello, " + name);
	}
	
	public int addNumbers(int first, int second) {
		int sum = first+second;
		return sum;
	}

}
