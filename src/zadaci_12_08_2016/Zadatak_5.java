
/*****************************************************************************************************************************
 * 
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 
 * program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 * 
 ****************************************************************************************************************************/

package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Scanner object for user input is created
			Scanner input = new Scanner(System.in);

			// ArrayList is created for numbers to be stored in
			ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

			// Prints an instruction for user input of numbers
			System.out.println("Enter unspecified number of integers in range from 1 to 100(0 ends the input): ");

			int numbers = input.nextInt();// User input

			arrayOfNumbers.add(numbers);// Adds user input to ArrayList

			negativeInput(numbers);// Calls a method to check if a number
									// entered is less than 0 and bigger than
									// 100
			numbers = input.nextInt();// Prompts user to enter a number again if
										// it is a negativeInput

			// If user input is not equal to zero add numbers to ArrayList
			while (numbers != 0) {
				arrayOfNumbers.add(numbers);// Adds number to ArrayList

				// Calls a method to check if a number entered is less than 0
				// and bigger than 100
				negativeInput(numbers);

				numbers = input.nextInt();// Prompts user to enter a number
											// again if it is a negativeInput
			}

			input.close();// Scanner closed

			// Displays header for counting result
			System.out.println("Entered numbers repeat count is as follows: \n");

			// Loops all numbers from 1 to 100
			for (int i = 1; i < 100; i++) {

				// Counts how many times a number is repeated if it is in an
				// ArrayList
				int numberCount = java.util.Collections.frequency(arrayOfNumbers, i);

				// If number has occurred even once in a list it is printed with
				// the number of repeats
				if (numberCount > 0) {
					System.out.println("Number " + i + " is repeated: " + numberCount);
				}

			}
			// Catches exception if it occurs or is thrown and prints a message
			// to user
		} catch (Exception e) {
			System.err.println("You have entered wrong type of data. Enter only integers from 1 to 100.");
		}

	}

	// Method checks if number is less then 0 or larger than 100
	public static void negativeInput(int n) {

		// If number is less then 0 or larger than 100 print a message
		if (n < 0 || n >= 100) {
			System.out.println("Wrong input. Enter integer from 1 to 100.");
		}
	}
}
