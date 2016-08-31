
/**********************************************************************************************
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 * m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * Store all smallest factors of m into an array list. n is the product of the factors that
 * appear an odd number of times in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 * in the array list. So, n is 10.)
 **********************************************************************************************/


package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_PerfectSquare {

	public static int number;

	public static void main(String[] args) {
		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// ArrayList for solution result
		ArrayList<Integer> solution = new ArrayList<>();

		// Prompts user to enter a number
		System.out.println("Enter an integer m: ");

		// Code that can throw an exception
		try {

			// User input
			number = input.nextInt();

			// Catches an exception
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input. Enter an integer as value.");
			main(args);
		}

		// Checks smallest factor
		int checkSmallest = 2;

		// Checks numbers factors and stores them to ArrayList
		while (number != 1) {
			if (number % checkSmallest == 0) {
				number = number / checkSmallest;
				solution.add(checkSmallest);
			} else {
				// Increments checking number if it is not a factor
				checkSmallest++;
			}
		}

		// List that stores odd numbers repetition
		ArrayList<Integer> anOddNumberOfRepetitions = new ArrayList<>();

		// Counts odd numbers
		int counter1 = 0;

		// Find the numbers that are repeated an odd number of times
		for (int i = 0; i < solution.size(); i++) {
			for (int j = 0; j < solution.size(); j++) {

				// If the number is repeated counter increments
				if (solution.get(i) == solution.get(j)) {
					counter1++;
				}
			}
			// If the counter is not duplicate add it to the array list
			if (counter1 % 2 != 0) {
				anOddNumberOfRepetitions.add(solution.get(i));
			}
			// Sets counter to 0
			counter1 = 0;
		}

		// List of numbers that are not repeated
		ArrayList<Integer> result = new ArrayList<>();

		// Counts numbers
		int counter = 0;

		// Compares numbers to find duplicates
		for (int i = 0; i < anOddNumberOfRepetitions.size(); i++) {
			for (int j = 0; j < result.size(); j++) {
				if (anOddNumberOfRepetitions.get(i) == result.get(j)) {
					counter++;
				}
			}
			// Add number to the list if it not a 0
			if (counter == 0) {
				result.add(anOddNumberOfRepetitions.get(i));
			}
			counter = 0;
		}

		// Number n to be checked
		int n = 1;
		for (int j = 0; j < result.size(); j++) {
			n *= result.get(j);
		}
		// Prints the result
		System.out.println(
				"The smallest number n for m * n to be a perfect square is " + n + "\nm * n is " + (number * n));

		// Scanner closed
		input.close();
	}

}
