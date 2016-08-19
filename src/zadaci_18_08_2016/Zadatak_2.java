
/*************************************************************************************
 * (Random number chooser) Write a method that returns a random number between
 * 1 and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows:
 * 
 * public static int getRandom(int... numbers)
 * 
 *************************************************************************************/

package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {

		// Code that can throw an exception
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prompts user to enter how many numbers he wants to exclude
			System.out.println("Enter how many numbers you want to exclude: ");

			// User input
			int num = input.nextInt();

			// Array that stores excluding numbers
			int[] numbers = new int[num];

			// Prompts user to enter numbers to be excluded
			System.out.println("Enter " + num + " numbers that you want to exclude(integers from 1 - 54): ");

			// Inputs numbers to be excluded in to array
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();

				// if number entered is less then 1 and larger than 54, user is
				// prompted to input number in correct range
				if (numbers[i] < 1 || numbers[i] > 54) {
					System.out.println("Wrong number. Enter numbers between 1 - 54.");
					numbers[i] = input.nextInt();
				}
			}
			// Scanner closed
			input.close();

			// Calls a method and prints the return number
			System.out.println("Random number from 1 - 54 excluding numbers in the array: " + getRandom(numbers));

			// Catches an exception if it occurs and outputs a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only integers.");
		}
	}

	// Returns random number between 1-54 excluding numbers in the arguments
	// array
	public static int getRandom(int... numbers) {

		// Generates random number
		int random = 1 + (int) (Math.random() * 54);

		// Checks numbers in array if they are equal to random number, random
		// number is generated again until it is not equal to numbers in the
		// array
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == random) {
				random = 1 + (int) (Math.random() * 54);
			}
		}
		//Returns random integer
		return random;
	}
}
