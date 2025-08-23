package com.sssso.training.java.oops.classes;

public class ClassesDemo {

	public static void main(String[] args) {
		
		Employee ravi = new Employee();
		
		ravi.setEmpId(101);
		ravi.setName("Ravi");
		ravi.setSalary(10000);
		
		System.out.println(ravi.getEmpId());
		System.out.println(ravi.getName());
		System.out.println(ravi.getSalary());
		
		Employee kumar = new Employee();
		
		kumar.setEmpId(102);
		kumar.setName("Kumar");
		kumar.setSalary(12000);
		
		System.out.println(kumar.getEmpId());
		System.out.println(kumar.getName());
		System.out.println(kumar.getSalary());
		
		
//		System.out.println("Emp Id: " + emp.empId);
//		System.out.println("Name: " + emp.name);
//		System.out.println("Salary: " + emp.salary);
		
////		OOPS: Object-Oriented Programming System.
//		Objects
//		Encapsulation
//		Polymorphism
//		Inheritance
//		Abstraction
//		Object-Oriented Programming Language: It is the language that supports all these concepts.
//		Java obeys all the above concepts, it is termed as Object-Oriented Programming Language.
		
//		Class and Object: 
//		Class: It is the template or blueprint for the object. 
//		It defines the data and state of an object.
		/*
		 * Employee
		 * Data: employee id, name, address, dept, salary, age, etc.,.
		 * State: login, logout, salarypaid, attendance, projects, etc.,.
		 * 
		 * [accessModifiers] [static] class <className> {
		 * 		Fields - Data
		 * 		Methods - State
		 * }
		 */
		
//		Object: The instance of the class. 
		/* 
		 * Memory is allocated only when object is created.
		 * new keyword - to create an object from the class definition.
		 * 
		 * <className> <objectName> = new <ClassName>();
		 */

	}

}
