/**
 * File: Lab08
 * Class: CSCI 1301
 * Author: Amber Caranto, Robert Montgomery
 * Created on: Oct 25, 2024
 * Last Modified: Oct 25, 2024
 * Description: Use overloaded methods to print a double average
 */
public class Lab08Prob03 {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        double a = 2, b = 3, c = 6, dd = 11;
        double d = 2.74, e = 3.45, f = 6.21, g = 11.91;

        // print the averages for the methods
        System.out.printf("The average of %.0f, %.0f, and %.0f is %.5f%n", a, b, c, avg(a, b, c));
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f%n", d, e, f, avg(d, e, f));
        System.out.printf("The average of %.0f, %.0f, %.0f, and %.0f is %.5f%n", a, b, c, dd, avg(a, b, c, dd));
        System.out.printf("The average of %.2f, %.2f, %.2f, and %.2f is %.5f%n", d, e, f, g, avg(d, e, f, g));
        
        System.out.println(stdDevSample(d, e, f, g));
     
    }

    public static double stdDevSample(double num1, double num2, double num3, double num4) {
    	
    	double average = avg(num1, num2, num3, num4);
    	double dis1 = Math.abs(num1 - average), dis2 = Math.abs(num2 - average), dis3 = Math.abs(num3 - average), dis4 = Math.abs(num4 - average);
    	double dis1Sqr = Math.pow(dis1, 2), dis2Sqr = Math.pow(dis2, 2), dis3Sqr = Math.pow(dis3, 2), dis4Sqr = Math.pow(dis4, 2);
    	double summation = dis1Sqr + dis2Sqr + dis3Sqr + dis4Sqr;
    	double almostThere = summation / 3;
    	double stdDev = Math.sqrt(almostThere);
    	
    	return stdDev;
    }
    
    // Method for integer average
    public static int avg (int num1, int num2, int num3) {
        int avg;
        return avg = (num1 + num2 + num3) / 3;
    }
    // Method for double average
    public static double avg (double num1, double num2, double num3) {
        double avg;

        return avg = (num1 + num2 + num3) / 3.0;
    }

    // Overloaded methods for the int and double avg methods
    // Max/min methods inapplicable because getting the average twice would print out the incorrect result
    // Therefore the new methods would not be able to properly call the smaller methods
    public static int avg (int num1, int num2, int num3, int num4) {
        int avg;
        return avg = (num1 + num2 + num3 + num4) / 4;
    }

    public static double avg (double num1, double num2, double num3, double num4) {
        double avg;
        return avg = (num1 + num2 + num3 + num4) / 4.0;
    }

}
