/**
 * File: Lab05Prob02
 * Class: CSCI1301
 * Author: Robert Montgomery, Arham Sawal
 * Created on: Oct 11, 2024
 * Last Modified: Oct 11, 2024
 * Description: Remove "continue" and "break" from the given code
 */

import java.util.Scanner;

public class Lab07Prob02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		System.out.print("Enter a number: ");
		userInput = input.nextInt();
		
		for (int i = 0; i < userInput && i < 25; i++) {
			
			if (i != 3 && i != 7 && i != 18 && i != 23) {
				System.out.printf("%d ", i);
			}
		
		}
		System.out.printf("%nYou entered %d%n", userInput);
		System.out.println("Program Completed");
		
	}

}
