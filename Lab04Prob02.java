/**
 * File: Lab04Prob02.java
 * Class: CSCI 1301
 * Author: Ian Heap, Robert Montgomery
 * Created on: Sep 6, 2024
 * Last Modified: Sep 6, 2024
 * Description: Write a Java program that will determine the season based on the given month
 */

import java.util.Scanner;

public class Lab04Prob02 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask the user for input
		System.out.print("Enter the month number: ");
		int userMonth = input.nextInt();
		
		// Create a string variable to assign winter months to a season
		String season = "";
		
		// Create if-else statement
		if (userMonth <= 2) {
			season = "winter";
		} else if (userMonth <= 5) {
			season = "spring";
		} else if (userMonth <= 8) {
			season = "summer";
		} else if (userMonth <= 11) {
			season = "fall";
		} else if (userMonth == 12) {
			season = "winter";
		}
		
		if (season.length() > 0) {
			System.out.println("Month " + userMonth + " occurs during " + season);
		} else {
			System.out.println("That is not a valid month");
		}

	}

}
