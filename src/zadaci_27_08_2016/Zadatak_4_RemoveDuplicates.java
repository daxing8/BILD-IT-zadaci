
/*****************************************************************************************
 *	(Remove duplicates) Write a method that removes the duplicate elements from
 *	an array list of integers using the following header:
 *
 *	public static void removeDuplicate(ArrayList<Integer> list)
 *
 *	Write a test program that prompts the user to enter 10 integers to a list and displays
 *	the distinct integers separated by exactly one space. 
 *
 *****************************************************************************************/


package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_4_RemoveDuplicates {

	public static void main(String[] args) {

		// Creates scanner object
		Scanner input = new Scanner(System.in);
		// Creates an ArrayList of Integer values
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Code that can throw an exception
		try {

			// Prompt the user to enter 10 numbers
			System.out.print("Enter 10 integers: ");

			// Adds 10 numbers to the list
			for (int i = 0; i < 10; i++) {
				list.add(input.nextInt());
			}
			
			//Calls a method to remove duplicate numbers from the list and prints distinct numbers
			removeDuplicates(list);
			
			// Scanner closed
			input.close();

			// Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Please enter a valid input value.");
			main(args);
		}
	}

	// Removes duplicate numbers from the array and prints the distinct numbers
	public static void removeDuplicates(ArrayList<Integer> list) {
		
		//Creates ArrayList to store distict numbers
		ArrayList<Integer> distinct = new ArrayList<>();
		
		//Adds only numbers that are not duplicates to ArrayList
		for (int i = 0; i < list.size(); i++) {
			
			//If the number is not already in the list add it
			if (!distinct.contains(list.get(i))) {
				distinct.add(list.get(i));
			}
		}
		//Prints the distinct numbers
		System.out.println("\nThe distict integers are: ");
		for (Integer integer : distinct) {
			System.out.print(integer + " ");
		}
	}
}
