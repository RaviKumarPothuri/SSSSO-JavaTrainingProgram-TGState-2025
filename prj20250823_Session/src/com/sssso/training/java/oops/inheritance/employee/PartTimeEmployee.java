package com.sssso.training.java.oops.inheritance.employee;

public class PartTimeEmployee extends Employee {

	private int commission;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int id, String name, String type) {
		super(id, name, type);
	}
	
	public PartTimeEmployee(int id, String name, String type, int commission) {
		super(id, name, type);
		this.commission = commission;
	}

	/**
	 * @return the Commission
	 */
	public int getCommission() {
		return commission;
	}

	/**
	 * @param Commission the Commission to set
	 */
	public void setCommission(int commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nCommission: " + commission;
	}	

}
