
/*************************************************************************************
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * 
 * public static double sum(ArrayList<Double> list)
 * 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 * 
 *************************************************************************************/


package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3_SumArrayList {

	public static void main(String[] args) {

		// Creates scanner object
		Scanner input = new Scanner(System.in);
		// Creates an ArrayList of Double values
		ArrayList<Double> list = new ArrayList<Double>();

		// Code that can throw an exception
		try {

			// Prompt the user to enter 5 numbers
			System.out.print("Enter a list of five decimal numbers: ");
			
			// Adds 5 numbers to the list
			for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());	
			}

			// Prints the result and calls a method to sum all elements of the list
			System.out.println("\nSum of the elements in the list is: " + sum(list));

			// Scanner closed
			input.close();

			// Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Please enter a valid input value.");
			main(args);
		}
	}

	// Returns the sum of the ArrayList numbers
	public static double sum(ArrayList<Double> list) {
		
		//Stores sumed numbers
		double sum = 0;
		
		//Sums all numbers in the array
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		//Returns the sum
		return sum;
	}

}
