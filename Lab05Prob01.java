/**
 * File: Lab05Prob01
 * Class: CSCI1301
 * Author: Robert Montgomery, Johnathan Hackett
 * Created on: Sep 20, 2024
 * Last Modified: Sep 20, 2024
 * Description: Determine the area of a triangle entered by user
 */

import java.util.Scanner;

public class Lab05Prob01 {

	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// User input triangle side lengths
		System.out.print("Enter side A of a triangle: ");
		double sideA = input.nextDouble();
		
		System.out.print("Enter side B of a triangle: ");
		double sideB = input.nextDouble();
		
		System.out.print("Enter side C of a triangle: ");
		double sideC = input.nextDouble();
		
		// Calculate the semi perimeter and area
		double semiPerimeter = ((sideA + sideB + sideC) / 2.0);
		double area = Math.sqrt(semiPerimeter * ((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)));
		
		// Print result of calculations
		System.out.println("For side lengths of " + sideA + ", " + sideB + ", " + sideC + ", the area is " + area);

	}

}
