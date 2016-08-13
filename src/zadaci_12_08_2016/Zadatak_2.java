
/*****************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese dva cijela, 
 * pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 * 
 *****************************************************************************************/

package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Scanner object created for user input
			Scanner input = new Scanner(System.in);

			// Prints instructions for user input of first number
			System.out.println("Enter first positive integer: ");

			int n1 = input.nextInt();// User input

			// Prints instructions for user input of second number
			System.out.println("Enter second positive integer: ");

			int n2 = input.nextInt();// User input
			
			//Scanner closed
			input.close();
			
			negativeInput(n1, n2); // Method checks if numbers user input is
									// negative number or a zero

			// Prints greatest and smallest common divisor of two numbers
			System.out.println(
					"Greatest common divisor of " + n1 + " and " + n2 + " is:\n" + greatestCommonDivisor(n1, n2)
							+ "\nSmallest common divisor of two numbers is:\n" + smallestCommonDivisor(n1, n2));

			// Catches exception if it occurs or is thrown and prints a message
			// to user
		} catch (Exception e) {
			System.err.println("Negative input. Enter only positive integers.");
		}

	}

	// Method finds and returns greatest common divisor of two integers
	public static int greatestCommonDivisor(int num1, int num2) {

		// While number 1 and number 2 are not equal to zero loop
		while (num1 != 0 && num2 != 0) {

			// Finds the gcd using Euclid's algorithm
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;

	}

	// Method finds smallest common divisor of two integers and returns the
	// result
	public static int smallestCommonDivisor(int num1, int num2) {

		// To store the scd
		int scd = 1;

		// Loop starts from number 2 since all numbers are divisible by 1
		for (int i = 2; i <= num1 && i <= num2; i++) {// until control variable
														// is smaller or equal
														// to both user input
														// integers

			// if a number is divisible with both integers it is a common
			// divisor
			if (num1 % i == 0 && num2 % i == 0) {

				// stores the first common divisor to the variable
				scd = i;

				// Exits the loop
				break;
			}
		}
		// returns smallest common divisor
		return scd;
	}

	// Method throws exception if one of the numbers is equal to or less then
	// zero
	public static void negativeInput(int n1, int n2) {
		if (n1 <= 0 || n2 <= 0) {

			// throws an exception
			throw new InputMismatchException();
		}
	}
}
