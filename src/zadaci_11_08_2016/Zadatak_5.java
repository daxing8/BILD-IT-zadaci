
/***********************************************************************************************************************
 * 
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva korisnik unijeo, 
 * koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. 
 * (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, 
 * negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 * 
 ***********************************************************************************************************************/



package zadaci_11_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// ArrayList for storing inputed numbers
			ArrayList<Integer> numberList = new ArrayList<>();
			
			// Console output of instructions for user input
			System.out.println("Enter indefinite amount of numbers(0 ends the input): ");

			// User input
			int numbers = input.nextInt();

			// Counter for positive numbers
			int positiveNumbers = 0;

			// Counter for negative numbers
			int negativeNumbers = 0;

			// For calculating sum
			double sum = 0;

			// Numbers are added to the list while user input is not a zero
			while (numbers != 0) {

				// If user input number is greater than 0 it is positive
				if (numbers > 0) {
					positiveNumbers++;// positive number counter is incremented
										// by one

					// else number is negative
				} else {
					negativeNumbers++;// negative number counter is incremented
										// by one
				}

				// Sums all entered numbers
				sum += numbers;

				// Adds a number to ArrayList
				numberList.add(numbers);

				// Prompts the user to enter another number
				numbers = input.nextInt();
			}

			// Calculates average of the numbers entered
			double average = sum / (positiveNumbers + negativeNumbers);

			// Prints amount of positive, negative, sum and average of numbers
			// entered
			System.out.println("Amount of positive numbers is: " + positiveNumbers + "\nNegative numbers: "
					+ negativeNumbers + "\nSum of all numbers is: " + sum + "\nAverage is: " + average);
			
			
			//Scanner object closed
			input.close();
			
			// Catches an exception when user input is wrong
		} catch (Exception e) {
			System.err.println("Wrong input. Enter only integer type numbers.");
		}

	}
}
