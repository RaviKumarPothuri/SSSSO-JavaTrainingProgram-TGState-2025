package com.sssso.training.java.oops.inheritance.employee;

public class FullTimeEmployee extends Employee {

	private int salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int id, String name, String type) {
		super(id, name, type);
	}
	
	public FullTimeEmployee(int id, String name, String type, int salary) {
		super(id, name, type);
		this.salary = salary;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nSalary: " + salary;
	}	

}
