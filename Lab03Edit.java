import java.util.*;

public class Lab03Edit {
	
	public static void main (String[] args) {
		
		printCreditHours(24, 124);
		printHoursRemaining(24, 124);
		
	} // End of main method
	
	public static void printCreditHours(int current, int total) {
		
		System.out.printf("You have %d credit hour(s), while your degree requires %d credit hour(s).%n", current, total);
		
	} // End of print credit hours method
	
	public static void printHoursRemaining(int current, int total) {
		
		// Declare all necessary variables with calculations
		int creditHoursLeft = total - current;
		double semestersLeft = creditHoursLeft / 15.0, 
				yearsLeft2 = semestersLeft / 2.0, yearsLeft3 = semestersLeft / 3.0;
		
		// Print calculations to the user
		System.out.printf("You have %d credit hour(s), %.2f semester(s) (# 15 credit hours"
				+ "/semester, %.2f year(s) (@ 2 semesters/year), and %.2f year(s) "
				+ "(@ 3 semesters/year) until graduation.", creditHoursLeft, semestersLeft, yearsLeft2, yearsLeft3);
		
	} // End of print hours remaining method

} // End of class
