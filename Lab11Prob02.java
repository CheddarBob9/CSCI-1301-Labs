/**
 * File: Lab11prob02
 * Class: CSCI 1301
 * Author: Axel Espinosa, Julian Kraft, Robert Montgomery
 * Created on: Nov 15, 2024
 * Last Modified: Nov 15, 2024
 * Description: 
 */
public class Lab11Prob02 {

	public static void main(String[] args) {
		int[][] testArray = { { 2, 9, 4 }, { -512, -1024, -2048 }, { 5, -8, 17 }, };

		// Call printRowMax method
		printRowMax(testArray);

	} // End of main method

	public static void printRowMax(int[][] array) {

		// Find and print the max value found in each row
		for (int i = 0; i < array.length; i++) {
			// Initialize and reset value of maxElement
			int maxElement = array[i][0];

			for (int j = 0; j < array[i].length; j++) {
				// Assign current element to the maxElement variable
				if (array[i][j] > maxElement) {
					maxElement = array[i][j];
				}
			}
			System.out.printf("Row %d Max: %d%n", i + 1, maxElement);
		}
	}

}
