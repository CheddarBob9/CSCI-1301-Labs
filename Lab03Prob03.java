/**
 * File: Lab03Prob02.java
 * Class: CSCI 1301
 * Author: Esai Salgado, Robert Montgomery
 * Created on: Aug 30, 2024
 * Last Modified: Aug 30, 2024
 * Description: Archive Java source code files and other documents into a zip file.
 */

import java.util.Scanner;

public class Lab03Prob03 {
	
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
		
		// Calculate remaining credit hours
		int creditHoursRemaining = totalHours - currentHours;
		
		// Calculate the semesters left until graduation
		double semestersRemaining = creditHoursRemaining / 15.0;
		
		// Calculate the years left until graduation @ 2 semesters per year
		double yearsRemaining2 = semestersRemaining / 2.0;
		
		// Calculate the years left until graduation @ 3 semesters per year
		double yearsRemaining3 = semestersRemaining / 3.0;
		
		// Calculate years, semesters, and remaining credit hours
		int yearsUntilGrad = creditHoursRemaining / 30; // Find years remaining
		int remainingCredits = creditHoursRemaining % 30;
		
		int semestersUntilGrad = remainingCredits / 15;// Find semesters remaining
		int creditsUntilGrad = remainingCredits % 15;
		
		// output results
		System.out.println("You have " + creditHoursRemaining + " credit hour(s) until graduation.");
		System.out.println("You have " + semestersRemaining + " semester(s) (@ 15 credit hours/semester) left until graduation.");
		System.out.println("You have " + yearsRemaining2 + " year(s) (@ 2 semesters/year) left until graduation.");
		System.out.println("You have " + yearsRemaining3 + " year(s) (@ 3 semesters/year) left until graduation.");
		System.out.println("You have " + yearsUntilGrad + " year(s), " + semestersUntilGrad + " semester(s), and " + creditsUntilGrad + 
				" credit hour(s) (@ 2 semesters/year) left until graduation.");
	}

}
