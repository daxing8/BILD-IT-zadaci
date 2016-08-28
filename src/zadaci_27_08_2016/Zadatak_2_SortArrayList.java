
/**************************************************************************************
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers:
 * 
 * public static void sort(ArrayList<Integer> list)
 * 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.
 * 
 **************************************************************************************/



package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_2_SortArrayList {

	public static void main(String[] args) {

		// Creates scanner object
		Scanner input = new Scanner(System.in);
		// Creates an ArrayList to store the integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Code that can throw an exception
		try {

			// Prompt the user to enter 5 numbers
			System.out.print("Enter a list of five integers: ");
			
			// Adds 5 numbers to the list
			for (int i = 0; i < 5; i++) {
				list.add(input.nextInt());
			}
			// Calls a method to sort the ArrayList in ascending order
			sort(list);

			// Scanner closed
			input.close();

			// Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Please enter a valid input value.");
			main(args);
		}
	}

	// Returns the maximum value in an ArrayList of integers
	public static void sort(ArrayList<Integer> list) {

		// Sorts the ArrayList in ascending order
		Collections.sort(list);

		// Prints the list
		System.out.println("\nList of integers sorted in increasing order: ");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

}
