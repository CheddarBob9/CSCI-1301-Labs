/**
 * File: Lab03Prob01.java
 * Class: CSCI 1301
 * Author: Esai Salgado, Robert Montgomery
 * Created on: Aug 30, 2024
 * Last Modified: Aug 30, 2024
 * Description: Calculate the user's Georgia Southern credit hours.
 */

import java.util.Scanner;

public class Lab03Prob01 {

	public static void main(String[] args) {
		
		// Create a scanner and ask for input and declare variables
		Scanner input = new Scanner(System.in);
		System.out.println("Number of current credit hours: ");
		int currentHours = input.nextInt();
		
		System.out.println("Total number of credit hours needed: ");
		int totalHours = input.nextInt();
		
		// Output message to the console
		System.out.println("You have " + currentHours + " credit hour(s).");
		System.out.println("Your degree requires " + totalHours + " credit hour(s).");

	}

}
