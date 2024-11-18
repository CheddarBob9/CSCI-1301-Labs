/**
* File: Lab08Prob01
* Class: CSCI 1301
* Author: Amber Caranto, Robert Montgomery
* Created on: Oct, 25 2024
* Last Modified: Oct 25, 2024
* Description: Determine the average of three values using methods
*/

import java.util.*;

public class Lab08Prob01 {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 6;
		double da = 2.74, db = 3.45, dc = 6.21;
		System.out.printf("The average of %.0f, %.0f, and %.0f, is %.5f%n", a, b, c, average(a, b, c));
		System.out.printf("The average of %.2f, %.2f, and %.2f, is %.5f%n",da, db, dc, average(da, db, dc));
		
	} // End of main method
	
	public static int average(int num1, int num2, int num3) {
		int average = (num1 + num2 + num3) / 3;
		return average;
	} // End of int average method
	
	public static double average(double num1, double num2, double num3) {
		double average = (num1 + num2 + num3) / 3;
		return average;
	} // End of double average method

} // End of class
