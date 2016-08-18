
/***************************************************************************************************
 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto 
 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 *
 ***************************************************************************************************/

package zadaci_17_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		// Scanner for user input created
		Scanner input = new Scanner(System.in);

		// Stores initial 10 numbers input by user
		ArrayList<Integer> numbers = new ArrayList<>();

		// Stores unique numbers
		ArrayList<Integer> uniques = new ArrayList<>();

		// Prompts users to enter 10 integers
		System.out.println("Enter 10 integers: ");

		// Adds 10 numbers to ArrayList
		for (int i = 0; i < 10; i++) {
			int number = input.nextInt(); // user input
			numbers.add(number);
		}

		input.close(); // Scanner closed

		// Counts repetition of a number in a list
		int repetitions = 0;

		// Counts unique numbers
		int uniquesCounter = 0;

		// Stores max number from the list
		int max = Collections.max(numbers);

		// Stores min number from the list
		int min = Collections.min(numbers);

		// Checks number ocurrence in a list and adds it to the second list of
		// unique numbers if it occurrs at least once
		for (int i = min; i <= max; i++) {

			repetitions = Collections.frequency(numbers, i);	//How many times did number repeat in the list

			if (repetitions > 0) {
				uniques.add(i);			//Adds it to the list of unique numbers
				
				uniquesCounter++;	//Counter is incremented by one if a number is unique
			}
		}
		
		//Prints a header
		System.out.print("Unique numbers in a list are: ");
		
		for (Integer temp : uniques) {		//Prints numbers from the list uniques
			System.out.print(temp + " ");
		}
		//Prints number of uniques
		System.out.println("\nCount of unique numbers is: " + uniquesCounter);
	}
}
