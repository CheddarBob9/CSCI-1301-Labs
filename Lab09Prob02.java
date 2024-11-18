/**
 * File: Lab09Prob02
 * Class: CSCI 1301
 * Author: Chad Grefski, Robert Montgomery
 * Created On: Nov 1, 2024
 * Last Modified: Nov 1, 2024
 * Description: Generate an array of 10 doubles using the array shortcut initializer
 */ 

import java.util.*;

public class Lab09Prob02 {

	public static void main(String[] args) {
		
		double[] arrayShortcut = {-12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 
				82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};
		int arrayLength = arrayShortcut.length, maxNumberIndex = 0;
		double maxNumber = arrayShortcut[0];
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.printf("Index %d of %d: %.5f%n", i , arrayLength - 1, arrayShortcut[i]);
			if (maxNumber < arrayShortcut[i]) {
				maxNumber = arrayShortcut[i];
				maxNumberIndex = i;
			}
		}
		
		System.out.printf("%nMaximum Value: %.5f at index %d%n", maxNumber, maxNumberIndex);
		
	}
	
}
