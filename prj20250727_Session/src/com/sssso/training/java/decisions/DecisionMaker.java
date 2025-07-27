package com.sssso.training.java.decisions;

public class DecisionMaker {

	public static void main(String[] args) {
		
//		Problem: There is student age given to you. If student is only below 18 we allow him.
//		if
		
		int age = 17;
		
		if(age <= 18) {
			System.out.println("Allowed...");
		}
		
//		Problem: I have a employee salary information. I want to give bonus to all employees whose salary is between 5000 to 10000 
//		and no bonus if salary is more than 10000.
		
//		if..else
		
		int salary = 5000;
		if(salary < 10000) {
			System.out.println("You got bonus!!!");
		} else {
			System.out.println("Sorry! you dont have bonus!!!");
		}
		
//		Problem: We have student Record. We need to grade based on his results. if > 35 % pass, if > 60 < 70, first class, > 70 distinction.
		
//		if..else if..else ladder
		
		int totalMarks = 35;
		if(totalMarks >= 70) {
			System.out.println("You passed in Distinction!");
		} else if(totalMarks >= 60) {
			System.out.println("You passed in First division!!!");
		} else if(totalMarks >= 35) {
			System.out.println("You are passed!!!");
		} else {
			System.out.println("Oops! You are failed!!!");
		}

	}

}
