
/**********************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu. 
 * 
 **********************************************************************************************************************/

package zadaci_12_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Creates scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prints instructions for user input of first integer
			System.out.println("Enter first integer: ");

			int n1 = input.nextInt();// User input

			// Prints instructions for user input of second integer
			System.out.println("Enter Second integer: ");

			int n2 = input.nextInt();// User input

			// Prints instructions for user input of third integer
			System.out.println("Enter Third integer: ");

			int n3 = input.nextInt();// User input

			input.close();// Scanner closed

			// Prints a header for sorted numbers
			System.out.println("Your numbers sorted: ");

			// Outputs numbers sorted with sortNumbers() method
			for (int temp : sortNumbers(n1, n2, n3)) {
				System.out.print(temp + " ");
			}

			// Catches exception if it occurs or is thrown and prints a message
			// to user
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only integers.");
		}

	}
	
	//Method that takes 3 integers and sorts them in a ascending order
	public static int[] sortNumbers(int n1, int n2, int n3) {
		
		//Creates an array and stored 3 numbers
		int[] numbers = { n1, n2, n3 };
		
		//Calls a method sort in Arrays class to sort the numbers
		Arrays.sort(numbers);
		
		//Returns an array of sorted numbers
		return numbers;
	}
}
