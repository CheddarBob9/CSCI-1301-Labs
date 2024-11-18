/**
* File: Lab10Prob02.java
* Class: CSCI 1301
* Author: Christopher Avelino, Rob Montgomery, Franklin Ham
* Created on: 11/8/2024
* Last Modified: 11/8/2024
* Description: Copying Arrays/ Passing Arrays from Methods
*/
public class Lab10Prob02 {
	public static void main(String[]args) {
		double[] list = { 18.7, -22.2, 43.4, 74.1, -25.5,46.6,27.8 };
		double[] newList = halfCopyArray(list);
		printArray(newList);
	}
	public static void printArray(double[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	public static double[] halfCopyArray(double[] list) {
	int midpoint = (int)Math.ceil(list.length / 2.0);
	double[] newList = new double [midpoint];
		for (int i = 0 ; i < newList.length; i++){
		newList[i] = list[i];
		}
		return newList;
	}
	
}