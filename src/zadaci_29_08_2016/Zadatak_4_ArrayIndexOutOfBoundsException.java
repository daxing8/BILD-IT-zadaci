
/****************************************************************************************
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
 * requirements:
 * ■ Creates an array with 100 randomly chosen integers.
 * ■ Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the
 * message Out of Bounds.
 ****************************************************************************************/


package zadaci_29_08_2016;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_4_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		// Scanner object for user input
		Scanner input = new Scanner(System.in);
		// Random object for generating random numbers
		Random random = new Random();

		// Code that can throw an exception
		try {

			// Prompts user to enter index of the array
			System.out.println("Enter the index of the array: ");
			int index = input.nextInt();
			
			//Array for storing 100 random integers
			int[] array = new int[100];
				
			//Fills the array with random integers
			Arrays.fill(array, random.nextInt(100));
			
			//Scanner closed
			input.close();
			
			//Prints the result
			System.out.println("Value in specified index of the array is: " + array[index]);

			// Catches an exception, prints a message and returns user to main
			// method
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}
}
