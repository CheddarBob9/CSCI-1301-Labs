/**
 * File: Lab09Prob02
 * Class: CSCI 1301
 * Author: Chad Grefski, Robert Montgomery
 * Created On: Nov 1, 2024
 * Last Modified: Nov 1, 2024
 * Description: Calculate the minimum, maximum, and average of the given array, as well as how many values are above and below said average.
 */ 

import java.util.*;

public class Lab09Prob03 {

	public static void main(String[] args) {
		
		double[] arrayShortcut = { -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 
				82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203 };
		int arrayLength = arrayShortcut.length;
		double maxNumber = arrayShortcut[0], minNumber = arrayShortcut[0];
		double average = 0;
		int valuesBelowAverage = 0, valuesAboveAverage = 0 ;
		
		for (int i = 0; i < arrayLength; i++) {
			maxNumber = (arrayShortcut[i] > maxNumber) ? arrayShortcut[i] : maxNumber;
			minNumber = (arrayShortcut[i] < minNumber) ? arrayShortcut[i] : minNumber;
			average += arrayShortcut[i];
		}
		average /= arrayLength;
		for (int i = 0; i < arrayLength; i++) {
			if (arrayShortcut[i] > average) {
				valuesAboveAverage++;
			} else {
				valuesBelowAverage++;
			}
		}
		
		System.out.printf("Maximum value: %.3f%nMinimum value: %.3f%nAverage value: %.3f%nValues above average: %d%nValues below average: %d%n", maxNumber, minNumber, average, valuesAboveAverage, valuesBelowAverage);
		
	}
	
}
