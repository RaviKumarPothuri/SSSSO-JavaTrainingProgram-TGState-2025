package com.sssso.training.java.oops.inheritance.employee;

public class MainDemo {
	public static void main(String[] args) {

		FullTimeEmployee fullEmp = new FullTimeEmployee(1, "Ravi", "Full", 10000);
//		System.out.println("Employee Details: \nId: " + fullEmp.getId() 
//							+ "\nName: " + fullEmp.getName() 
//							+ "\nType: " + fullEmp.getType() 
//							+ "\nSalary: " + fullEmp.getSalary());
		System.out.println(fullEmp);
		FullTimeEmployee fullEmp1 = new FullTimeEmployee(2, "Kumar", "Full", 12000);
//		System.out.println("Employee Details: \nId: " + fullEmp1.getId() 
//							+ "\nName: " + fullEmp1.getName() 
//							+ "\nType: " + fullEmp1.getType() 
//							+ "\nSalary: " + fullEmp1.getSalary());
		System.out.println(fullEmp1);
		PartTimeEmployee partEmp = new PartTimeEmployee(1, "Varma", "Part", 5000);
		System.out.println(partEmp);

	}
}
