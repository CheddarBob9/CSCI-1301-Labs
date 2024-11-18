/** 
 * File: Lab06
 * Class: CSCI 1301
 * Author: Robert Montgomery
 * Created On: Oct 4, 2024
 * Last Modified: Oct 17, 2024
 * Description: Create a do-while loops to read user input and determine the largest and smallest entered values 
 */

import java.util.*;

public class Lab06Prob01 {

	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Initialize and declare variables to be used in loop and if statements
		double userValue, maxValue = -100.0, minValue = 100.0;
		
		do {
			// Prompt user for input
			System.out.print("Enter values in the form of doubles from -100.0 to 100.0 (-19.5 to exit): ");
			// Save user input in userValue variable
			userValue = input.nextDouble();
			
			if (userValue >= -100.0 && userValue <= 100.0 && userValue != -19.5) {
				if (userValue > maxValue) {
					maxValue = userValue;
				} else if (userValue < minValue) {
					minValue = userValue;
				}
			}
		} while (userValue != -19.5);
		
		System.out.printf("The max value was %.1f"
				+ "%nThe min value was %.1f", maxValue, minValue);
		
	}

}
