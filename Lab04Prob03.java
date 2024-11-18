/**
 * File: Lab04Prob03.java
 * Class: CSCI 1301
 * Author: Ian Heap, Robert Montgomery
 * Created on: Sep 6, 2024
 * Last Modified: Sep 6, 2024
 * Description: Calculate a scheme for awarding raises
 */

import gsu.Math;

public class Lab04Prob03 {

	public static void main(String[] args) {
		
		// Generate a random number
		int randomNumber = (int)(Math.random() * 951);
		
		// Constrain random number to 0-6 and assign to statusNumber
		int statusNumber = (randomNumber % 7);
		
		// Declare variables for raise percentage
		double raise = 0;
		
		// Use and if-else statement to implement the scheme
		if (statusNumber == 0) {
			raise = 0;
		} else if (statusNumber == 1) {
			raise = 3.7;
		} else if (statusNumber == 2) {
			raise = 4.2;
		} else if (statusNumber == 3) {
			raise = 5.7;
		} else if (statusNumber == 4) {
			raise = 6.1;
		} else if (statusNumber == 5) {
			raise = 7.3;
		} else if (statusNumber == 6) {
			raise = 8.7;
		}
		
		// Declare variables for calculations
		double initialSalary = 40000.0;
		double raisePercent = initialSalary * (raise / 100);
		double newSalary = initialSalary + raisePercent;
		
		// Output calculations to the console
		System.out.println("With a random status of " + statusNumber + " and an initial salary of $" + initialSalary + 
				", your raise is " + raise + "% which equates to a new salary of $" + newSalary + ".");

	}

}
