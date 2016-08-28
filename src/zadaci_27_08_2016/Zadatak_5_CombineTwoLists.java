
/*******************************************************************************************
 * (Combine two lists) Write a method that returns the union of two array lists of
 * integers using the following header:
 * public static ArrayList<Integer> union(
 * ArrayList<Integer> list1, ArrayList<Integer> list2)
 * 
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated by
 * exactly one space in the output.
 * 
 *******************************************************************************************/


package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5_CombineTwoLists {

	public static void main(String[] args) {

		// Creates scanner object
		Scanner input = new Scanner(System.in);
		// Creates two ArrayLists for integer values
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// Code that can throw an exception
		try {

			// Prompt the user to enter 5 numbers
			System.out.print("Enter five integers for list1: ");
			
			//Adds five numbers to the list1
			for (int i = 0; i < 5; i++) {
				list1.add(input.nextInt());
			}
			

			// Prompt the user to enter 5 numbers
			System.out.print("Enter five integers for list1: ");
			
			//Adds five numbers to the list2
			for (int i = 0; i < 5; i++) {
				list2.add(input.nextInt());
			}
			
			//Prints the combined list 
			System.out.println("\nThe combined list is: ");
			for (Integer integer : union(list1, list2)) {
				System.out.print(integer + " ");
			}
			// Scanner closed
			input.close();

			// Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Please enter a valid input value.");
			main(args);
		}
	}

	// Returns the sum of the ArrayList numbers
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
		
		return list1;
	}

}
