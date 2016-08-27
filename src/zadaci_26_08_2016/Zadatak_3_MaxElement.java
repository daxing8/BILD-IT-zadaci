
/**************************************************************************************
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * 
 * public static Integer max(ArrayList<Integer> list)
 * 
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0, and invokes this method to return the largest number in the input.
 *
 ***************************************************************************************/


package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_3_MaxElement {

	public static void main(String[] args) {
		
		//Creates scanner object
		Scanner input = new Scanner(System.in);
		// Creates an ArrayList to store the integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Code that can throw an exception
		try {
			
			// Prompt the user to enter a sequence of numbers ending with 0
			System.out.print("Enter list of integers (0 ends the input): ");
			Integer number = input.nextInt();
			
			//While input is not 0 add elements to the list
			while (number != 0) {
				list.add(number);
				number = input.nextInt();
			}
			
			// Display the largest number in the input 
			System.out.println("\nThe largest number in the list is:  " + max(list));
			
			input.close();
			
			//Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Please enter a valid input value.");
			main(args);
		}
	}

	// Returns the maximum value in an ArrayList of integers 
	public static Integer max(ArrayList<Integer> list) {
		//If ArrayList is empty return null value
		if (list.size() == 0)
			return null;
		
		return Collections.max(list);
	}

}
