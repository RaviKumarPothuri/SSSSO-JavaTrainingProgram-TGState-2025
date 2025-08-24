package com.sssso.training.java.exceptions.custom;

public class EmployeeNotFoundException extends RuntimeException {
	public String message;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
