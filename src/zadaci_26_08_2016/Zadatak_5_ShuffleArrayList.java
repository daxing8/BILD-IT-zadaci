
/************************************************************************************
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers.
 * 
 * public static void shuffle(ArrayList<Integer> list)
 * 
 ************************************************************************************/


package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_5_ShuffleArrayList {

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
					
					//Calls a method to shuffle and print list of integers
					shuffle(list);
					
					//Scanner closed
					input.close();
					
					//Catches an exception and prints a message
				} catch (Exception e) {
					System.out.println("Wrong input. Please enter a valid input value.");
					main(args);
				}
			}

			// Returns randomly shuffled ArrayList of integers 
			public static void shuffle(ArrayList<Integer> list) {
				//Calls a metho to shuffle the list	
				Collections.shuffle(list);
					
					//Prints out all numbers from list shuffled
					System.out.println("\nList of integers randomly shuffled: ");
					for (Integer integer : list) {
						System.out.print(integer + " ");
					}
	}
	
}
