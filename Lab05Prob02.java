/**
 * File: Lab05Prob02
 * Class: CSCI1301
 * Author: Robert Montgomery, Johnathan Hackett
 * Created on: Sep 20, 2024
 * Last Modified: Sep 20, 2024
 * Description: Find the first middle and last character of a String
 */

import java.util.Scanner;

public class Lab05Prob02 {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask the user for input
		System.out.print("Enter a string of your choice: ");
		String userLine = input.nextLine();
		
		// Find string length
		int stringLength = userLine.length();
		
		// Calculate first last and middle letter
		char firstLetter = userLine.charAt(0);
		char lastLetter = userLine.charAt(stringLength - 1);
		char middleLetter = 'k';
		
		if (userLine.length() < 4) {
			System.out.println("The string you entered " + userLine + " contains less than 4 characters");
		} else {
			// Output result
			System.out.println("For the string " + userLine);
			System.out.println("first letter is " + firstLetter);
			System.out.println("last letter is " + lastLetter);
			System.out.println("\"middle\" letter is " + middleLetter);
		}

	}

}
