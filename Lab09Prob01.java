/**
 * File: Lab09Prob01
 * Class: CSCI 1301
 * Author: Chad Grefski, Robert Montgomery
 * Created On: Nov 1, 2024
 * Last Modified: Nov 1, 2024
 * Description: Generate an array of 12 random numbers and show length and minimum
 */

import java.util.*;
//import gsu.Math;

public class Lab09Prob01 {

	public static void main(String[] args) {

		// Create an array 
		int[] arrayOfRandoms = new int[12];
		int minNumber = arrayOfRandoms[0], minNumberIndex = 0, minBound = -256, maxBound = 513;
		
		System.out.println("Length: " + arrayOfRandoms.length + "\n");
		
		// Generate 12 random numbers between -256 and 256
		for (int i = 0; i < arrayOfRandoms.length; i++) {
			
			arrayOfRandoms[i] = (int)(minBound + Math.random() * maxBound);
			
			System.out.println(arrayOfRandoms[i]);
			
			if (minNumber > arrayOfRandoms[i]) {
				minNumber = arrayOfRandoms[i];
				minNumberIndex = i;
			}
		}
		
		// Print output
		System.out.printf("%nMinimum value: %d at index %d%n", minNumber, minNumberIndex);
		
	} // End of main method

}
