/**
* File: PAssign10.java
* Class: CSCI 1301
* Author: Franklin Ham, Robert Montgomery, Chris Avelino
* Created on: Nov 8, 2024
* Last Modified: Nov 8, 2024
* Description: Find statistics about Savannah weather
*/

import java.util.Scanner;

public class Lab10Prob03 {
	public static void main(String[] args) {
		//Create a Scanner object.
		Scanner input = new Scanner (System.in);
		
		int[] highs = { 66, 73, 77, 79, 81, 82, 83, 85, 85, 87, 82 };
		
		int[] lows = { 41, 44, 49, 51, 49, 62, 59, 59, 57, 61, 63 };
		
		double totalHigh = 0, totalLow = 0;
		int minTemp = Integer.MAX_VALUE, maxTemp = Integer.MIN_VALUE, daysAboveAveCount = 0, arrayLength = highs.length;
		
		System.out.println("Days greater than 25 degree difference: ");
		
		for (int i = 0; i < highs.length; i++) {
			
			totalHigh += highs[i];
			totalLow += lows[i];
			
			if (lows[i] < minTemp) {
				minTemp = lows[i];	
			}
			if (highs[i] > maxTemp) {
				maxTemp = highs[i];
			}
			
			for (int j = 0; j < lows.length; j++ ) {
				
			}
			if (highs[i] - lows[i] > 25) {
				System.out.printf("Day %d:\t%d\n", i, highs[i] - lows[i]);
				daysAboveAveCount++;
			}
		}
	
		double averageHigh = totalHigh / highs.length, averageLow = totalLow / lows.length, averageDifference = averageHigh - averageLow;
	
		System.out.printf("\nStatistics:%n"
				+ "Min Low: %d%n"
				+ "Average Low: %.2f%n%n"
				+ "Max High: %d%n"
				+ "Average High: %.2f%n%n"
				+ "Average Difference: %.2f%n"
				+ "Number of days with above-average difference: %d out of %d", minTemp, averageLow, maxTemp, averageHigh, averageDifference, daysAboveAveCount, arrayLength);
		
	}
}
