/**
 * File: Lab05Prob02
 * Class: CSCI1301
 * Author: Robert Montgomery, Johnathan Hackett
 * Created on: Sep 20, 2024
 * Last Modified: Sep 20, 2024
 * Description: Find the first middle and last character of a String
 */

import java.util.Scanner;

public class Lab05Prob03 {

	public static void main(String[] args) {
		
		// Create Scanner object
		System.out.print("Enter a 5 letter word: ");
		Scanner input = new Scanner(System.in);
		
		// Store user input
		String userWord = input.nextLine();
		
		// Create variables for the characters
		char letter0 = userWord.charAt(0);
		char letter1 = userWord.charAt(1);
		char letter2 = userWord.charAt(2);
		char letter3 = userWord.charAt(3);
		char letter4 = userWord.charAt(4);
		
		// Determine length of string and id valid or not
		int userLineLength = userWord.length();
		if (userLineLength != 5) {
			System.out.println("The string you entered " + userWord + " does not contain 5 characters");
		} else {
			char temp1 = letter0;
			letter0 = letter4;
			letter4 = temp1;
			char temp2 = letter1;
			letter1 = letter3;
			letter3 = temp2;
			
			String reverse = "" + letter0 + letter1 + letter2 + letter3 + letter4;
			
			System.out.println("For the string " + userWord + " the reverse is " + reverse);

		} 

	}

}
