/**
* File: Lab10Prob01.java
* Class: CSCI 1301
* Author: Christopher Avelino, Rob Montgomery, Franklin Ham
* Created on: 11/8/2024
* Last Modified: 11/8/2024
* Description: Creating Arrays/ Passing Arrays to Methods
*/
public class Lab10Prob01 {
	public static void main(String[]args) {
		double[] list = new double [21];
		for (int i = 0; i < list.length; i++) {
			list[i] = 7.0 * i;
		}
		printArray(list);
	}
	public static void printArray(double[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}