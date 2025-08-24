package com.sssso.training.java.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {

//		ExceptionHandling: It is the mechanism used in Java to handle the runtime error.
//		Exception: It is the event that disrupts the flow of execution.
//		We can use the try..catch blocks to handle the exceptions.
//		Finally block will be executed even exception occurs.

//		checked (compile-time exceptions) and unchecked (run-time exceptions)
//		We can create our own exception named as Custom Exceptions.
//		To handle the exceptions in the caller method, use the throws keyword.
//		Errors: These are the unrecoverable issues occur during program execution.
		
//		Throw: To raise an exception (custom or built-in).
//		Throws: To catch the exception raised in a method. This exception caught can be handled
//		in the caller method.

		int a = 10;
		int b = 0;
//		if (b == 0)
//			throw new EmployeeNotFoundException("Employee not found exception occured");
		int answer = 0;
		try {
			answer = divide(a, b);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			String exceptionClassName = e.getClass().getSimpleName();
			if (exceptionClassName.equalsIgnoreCase("ArithmeticException"))
				System.out.println(exceptionClassName);
			System.out.println("Arithmetic Exception occured");
		} 
		System.out.println(answer);
		System.out.println("It is the end of the program...");
	}

	public static int divide(int first, int second) throws ArithmeticException, ArrayIndexOutOfBoundsException {
//		Scanner sc = new Scanner(System.in);
		return first / second;
//		try {
//		someOther(first, second);

//		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception occurred");
//		} finally {
//			sc.close();
//		}
//		return -1;
	}

	public static int someOther(int first, int second) {
		try {
			second = 1;
			return first / second;
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}
		return -1;
	}

}
