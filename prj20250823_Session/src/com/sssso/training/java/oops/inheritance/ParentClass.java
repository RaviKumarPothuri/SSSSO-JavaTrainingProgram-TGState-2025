package com.sssso.training.java.oops.inheritance;

public class ParentClass {
	private int firstNumber;
	private int secondNumber;

	public ParentClass() {
	}

	public ParentClass(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	/**
	 * @return the firstNumber
	 */
	public int getFirstNumber() {
		return firstNumber;
	}

	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * @return the secondNumber
	 */
	public int getSecondNumber() {
		return secondNumber;
	}

	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	protected int printSum() {
		int answer = this.firstNumber + this.secondNumber;
//		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + answer);
		return answer;
	}
}
