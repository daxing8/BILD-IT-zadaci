
/***************************************************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) 
 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu ispisuje da je danas utorak a dan u buduænosti je petak.) 
 * 
 ***************************************************************************************************************************************************/

package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws InputMismatchException {// main
																			// method
																			// throws
																			// an
																			// exception

		// Try block checks if there are exceptions to be caught
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prints user input instructions
			System.out
					.println("Enter today's day of the week as an integer(0 - Monday, 1 - Tuesday... 6 - Saturday): ");

			// user input
			int today = input.nextInt();

			// Calls a method to check if user input is in the bounds of Array
			wrongInput(today);

			// Prints user input message
			System.out.println("Enter the number of days elapsed since today: ");

			// User input of days in the future
			int daysElapsed = input.nextInt();

			// Calls a method to check if user input is equal or less then 0
			negativeInput(daysElapsed);

			// Scanner closed for input
			input.close();

			// Array of Strings representing days of the week
			String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

			// Formula for calculating days in the future
			int futureDay = (today + daysElapsed) % 7;

			// Prints which day is today and which day it is in the future
			System.out.println(
					"Today is " + dayNames[today] + " and the day in the future is " + dayNames[futureDay] + ".");

			// Catches multiple exceptions that may occur and stops the program
			// from executing
		} catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
			System.out.println("Wrong input! Enter correct input request.");

		}

	}

	// Method takes one argument and checks if number is less then of more then
	// Array bounds
	public static void wrongInput(int n1) {

		if (n1 < 0 && n1 > 6) {// If number is less then 0 or more then 6 throw
								// an exception

			// throws an exception
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	// Method takes one integer as an argument and checks if the number is less
	// then or equal to 0
	public static void negativeInput(int n) {

		if (n <= 0) {// if number is less then or equal to 0 throw an exception

			// throws a new exception
			throw new InputMismatchException();
		}
	}
}
