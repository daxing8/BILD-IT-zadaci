package crapsAndCreditCard;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {

		// Finds the exception and sends it to catch block
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prompts the user to enter credit card number
			System.out.println("Enter a valid credit card number as long integer: ");

			// User input
			long creditCardNumber = input.nextLong();

			// Scanner closed
			input.close();

			// Calls a method to check if a number is valid credit card number
			if (isValid(creditCardNumber)) {
				System.out.println("Your credit card number " + creditCardNumber + " is Valid.");
			} else
				System.out.println("Your credit card number " + creditCardNumber + " is Invalid.");

			// Catches any exception if it occurs
		} catch (Exception e) {
			System.out.println("Credit card input not Valid! Try again.");
		}
	}

	// Return true if a credit card number is valid
	public static boolean isValid(long number) {

		// Sums even and odd numbers
		int sumOfDoubleAndOdd = sumOfDoubleEvenPlace(number) + sumOfOddPlaces(number);

		// Checks length of credit card number
		if (getSize(number) < 13 || getSize(number) > 16) {
			return false; // returns false if it is less 13 or more then 16
							// digits
		}

		// Checks if a sum of even and odd numbers is divisible by 10
		if (sumOfDoubleAndOdd % 10 != 0) {
			return false; // returns false if it is not the case
		}

		// if number prefix is any of the 4 numbers representing credit cards it
		// is valid
		if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
				|| prefixMatched(number, 6)) {
			return true; // returns that a number is valid
		}

		// returns false if any of the previous checks were not true
		return false;

	}

	// Get result from step 2
	public static int sumOfDoubleEvenPlace(long number) {

		// Turns long type number into String
		String everyEven = number + "";

		// Sums all the numbers
		int sum = 0;

		for (int i = 0; i < everyEven.length(); i += 2) {

			sum += getDigit((everyEven.charAt(i) - '0') * 2); // doubles all
																// even numbers
																// and sums them
																// to a variable
		}
		return sum; // returns the sum of numbers
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlaces(long number) {

		// Turns long type number into String
		String everyOdd = number + "";

		// Sums all numbers
		int sum = 0;

		for (int i = 1; i < everyOdd.length(); i += 2) { // skips to every odd
															// number in the
															// string
			sum += everyOdd.charAt(i) - '0'; // sums all the odd place numbers
		}
		return sum; // returns the result
	}

	// Return this number if it is a single digit, otherwise, return the sum of
	// the two digits
	public static int getDigit(int number) {

		// Stores one digit
		int n = 0;

		// If a number is one digit return the number
		if (number < 10) {
			return number; // returns the number

		} else// If number has two digits

			n = number % 10; // Remainder of the division is added to variable

		number /= 10; // Divides the number to get rid of the second digit

		return number += n; // Adds two digits to get the result
	}

	// Return true if a digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {

		// If prefix of a number is same as size of the d it is a valid prefix
		if (getPrefix(number, getSize(d)) == d) {
			return true;
		}

		// In other case it is not valid and returns false
		return false;
	}

	// Return number of digits in d
	public static int getSize(long d) {

		// From long to String
		String size = d + "";

		// Returns the size of the string to get the number of digits
		return size.length();
	}

	/*
	 * Return first k number of digits from number. If the number of digits in
	 * number is less then k, return number.
	 */
	public static long getPrefix(long number, int k) {

		// From long to String
		String n = number + "";

		// Stores the prefix number
		int prefixNumber = 0;

		// If the number of digits in number is less then argument k, return
		// number
		if (n.length() < k) {
			return number;
		} else // In other case loop through k and add values to the variable

			for (int i = 0; i < k; i++) {
				prefixNumber += n.charAt(i) - '0'; // Sums all numbers to
													// variable
			}
		return prefixNumber; // returns the number of prefix
	}
}
