package com.sssso.training.java.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

/*		Array: It is a variable that stores multiple values of same data type at consecutive (continuous) memory locations.  
 * 		Broadly classified into 2 types:
 * 			Single Dimensional - 1D
 * 			Multi Dimensional - 2D, 3D, ... Jagged, etc.
 * 
 * */
//		
/* 		Problem: Accept 1 to 10 numbers, store and print them. 
 * 		Solutions: 
 * */
//		
//		int num = 0;
//		for(int i=0; i<10; i++) {
//			System.out.println("Enter a number: ");
//			num = scanner.nextInt();
//			System.out.println("The number is: " + num);
//		}
//		
//		int num1, num2, num3, num4, num5;
//		System.out.println("Enter a number: ");
//		num1 = scanner.nextInt();
//		
//		int[] nums = new int[5]; // java.lang.Object
//		System.out.println("Value: " + nums[0]);
//		System.out.println("Value: " + nums[1]);
//		
//		int[] numbs = {1,2,3,4,5};
//		System.out.println(numbs[0]);
//		
//		int[][] numbers = new int[2][2];
//		int[][] numbers1 = {{0,0},{0,1},{1,0},{1,1}};
//		
//		System.out.println(numbers1[1][1]);
//		
/*		Problem: Accept and store the following matrix in an array names as mat01. Print the array in matrix format.
 * 		Example
 * 			1	1
 * 			1	1
*/
//		
//		Scanner scr = new Scanner(System.in);
//
//		System.out.println("Enter total no of rows: ");
//		int rows = scr.nextInt();
//		
//		System.out.println("Enter total no of cols: ");
//		int cols = scr.nextInt();
//		
//		int[][] mat01 = new int[rows][cols];
//		
//		for(int row=0; row<rows; row++) {
//			for(int col=0; col<cols; col++) {
//				System.out.println("Enter a value at " + row + ":" + col);
//				mat01[row][col] = scr.nextInt();
//			}
//		}
//		
//		for(int row=0; row<rows; row++) {
//			for(int col=0; col<cols; col++) {
//				System.out.print(mat01[row][col] + "\t");
//			}
//			System.out.print("\n");
//		}
//		
//		scr.close();
//		
/* Escape Sequences: 
 * 	/t - Tab
 *  /r - Carriage return
 *  /n - New Line
 *  // - Forward slash
 *  /" - Double
 *  /' - Single quote
 * */
//		System.out.println("\'This is first line\"This is second line\nThis is third line");
//		
//		Problem: Find the no of elements in an array.
//		
//		int[] nums = {15,25,35,45,55,65};
//		System.out.println("Total no of elements: " + nums.length);
//		for(int row=0; row < nums.length; row++) {
//			System.out.println(nums[row]);
//		}
//		
//		Problem: Print the values in an array in reverse order.
//		int[] nums = {15,25,35,45,55,65};
//		for(int row=nums.length-1; row>=0; row--) {
//			System.out.println(nums[row]);
//		}
//		
//		String[] names = {"ravi", "kumar", "varma"};
//		for(int row = 0; row<names.length; row++) {
//			System.out.println(names[row]);
//		}
		
	}

}
