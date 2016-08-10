
/**************************************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string substring prvog stringa. 
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
 * 
 **************************************************************************************************************************************/

package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Creates Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prints message for user to enter the first string
			System.out.println("Enter first string: ");

			// User input
			String s1 = input.nextLine().toUpperCase();

			// Calls a method that checks if user mistakenly inputed a digit
			// instead of a letter
			wrongInput(s1);

			// Prints message for user to enter the first string
			System.out.println("Enter second string: ");

			// User input
			String s2 = input.nextLine().toUpperCase();

			// Calls a method to check if user input is a digit
			wrongInput(s2);

			// Scanner closed for user input
			input.close();

			// If first string contains second string it is a substring
			if (s1.contains(s2)) {

				// Prints that s2 is a substring of s1
				System.out.println(s2 + " is a substring of " + s1);
			} else {
				// In the other case s2 is not a s1 substring
				System.out.println(s2 + " is not a substring of " + s1);
			}

			// Catches input mismatch exception by user
			// Stops the program from executing and prints a warning message
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only string type input.");
		}
	}

	// Method that checks if string input from user is a digit
	public static void wrongInput(String s1) {

		// Checks every character in a string
		for (int j = 0; j < s1.length(); j++) {
			// If character in a string is a digit it throws a new exception
			if (Character.isDigit(s1.charAt(j))) {

				// Throws an exception
				throw new InputMismatchException();
			}
		}
	}
}
