/**
 * File: Lab05Prob01
 * Class: CSCI1301
 * Author: Robert Montgomery, Arham Sawal
 * Created on: Oct 11, 2024
 * Last Modified: Oct 11, 2024
 * Description: Use loops to create a pattern of asterisks
 */

public class Lab07Prob01 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}

}
