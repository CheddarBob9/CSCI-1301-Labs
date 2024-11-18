/**
* File: Lab11Prob03.java
* Class: CSCI 1301
* Author: Julian Kraft, Alex Espinosa-Chan, Robert Montgomery
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Transpose a 2D Array
*/
public class Lab11Prob03 {

	public static void main(String[] args) {
		// Create list to be transposed
		int[][] list = { { 1, 2, 3 }, { 5, 4, 6 }, { 9, 8, 7 }, { 12, 10, 11 } };

		// Create loop to test if array is correct
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.printf("%2d ", list[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		// Transpose the list using method
		int[][] transposedList = transpose2DArray(list);

		// Check if new list was transposed correctly
		for (int i = 0; i < transposedList.length; i++) {
			for (int j = 0; j < transposedList[i].length; j++) {
				System.out.printf("%2d ", transposedList[i][j]);
			}
			System.out.println();
		}

	}

	// Create method to transpose list
	public static int[][] transpose2DArray(int[][] array) {

		// Make new temp list to change array without affecting previous one, with
		// lengths being swapped
		int[][] tempArray = new int[array[0].length][array.length];

		// For loop to fill the list correctly
		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				tempArray[i][j] = array[j][i];
			}
		}

		return tempArray;

	}

}
