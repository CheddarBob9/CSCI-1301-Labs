/**
 * File: Lab02Prob02
 * Class: CSCI 1301
 * Author: Franklin Ham, Robert Montgomery
 * Created on: Aug 23, 2024
 * Description: Display some statistics about birthYear and currentAge
 */

import java.util.Scanner;

public class Lab02Prob03 {

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for birth year
		System.out.print("Enter your birth year: ");
		int birthYear = input.nextInt();
		
		// declare variable currentAge and compute 
		int currentAge = 2024 - birthYear;
		
		// print current age to console
		System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
		
		// show the user how old they will be in 15 years 
		int fifteenYears = currentAge + 15;
		System.out.println("In 15 years, you will be " + (fifteenYears) + " years old.");
		
		// show the user the age of someone twice their age
		int twiceAge = currentAge * 2;
		System.out.println("Someone twice your age is " + (twiceAge) + " years old.");
		
		// show the user the age of someone half their age
		double halfAge = currentAge / 2.0;
		System.out.println("Someone half your age is " + (halfAge) + " years old.");


	}

}
