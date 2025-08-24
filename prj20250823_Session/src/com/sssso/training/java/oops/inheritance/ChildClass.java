package com.sssso.training.java.oops.inheritance;

public class ChildClass extends ParentClass {
	private int c;

	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}

	public void addValues(int a, int b) {
		super.setFirstNumber(a);
		super.setSecondNumber(b);
		super.printSum();
	}
	
	public void addValues(int a, int b, int c) {
		super.setFirstNumber(a);
		super.setSecondNumber(b);
		System.out.println("The sum of is: " + (super.printSum() + c));
	}
}
