/**
* File: Lab11Prob01.java
* Class: CSCI 1301
* Author: Axel Espinosa, Julian Kraft, Rob Montgomery
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Decides whether or not to toss or keep pirateBooty
*/
public class Lab11Prob01 {

	public static void main(String[] args) {
		int[][] pirateBooty = { { 110, 1600 }, { 101, 1400 }, { 200, 50 }, { 322, 700 }, { 57, 500 }, { 625, 1500 },
				{ 300, 320 }, { 50, 210 }, { 100, 105 }, { 90, 400 }, { 30, 2000 }, { 200, 1300 }, };

		boolean[] decisions = new boolean[pirateBooty.length];
		String decision = "";

		for (int i = 0; i < pirateBooty.length; i++) {
			if (pirateBooty[i][0] > 100 && pirateBooty[i][1] < 1500) {
				decisions[i] = true;
			} else {
				decisions[i] = false;
			}

		}
		for (int i = 0; i < decisions.length; i++) {
			decision = (decisions[i]) ? "toss" : "keep";
			System.out.printf("Cargo %2d: %s%n", i + 1, decision);
		}

	}

}
