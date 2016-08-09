
/*******************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
 * te mu ispiše broj dana u tom mjesecu. 
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
 * 
 *******************************************************************************************************************/



package zadaci_08_08_2016;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) throws InputMismatchException { // Throws
																			// an
																			// exception

		// searches for exception occurrences
		try {

			// Scanner object is instantiated for user input
			Scanner input = new Scanner(System.in);

			// Message for user to enter a year of his/her's choosing
			System.out.println("Enter a year: ");

			// Input of year from user
			int year = input.nextInt();

			// Message for user to enter month of a year of his/her's choosing
			System.out.println(
					"Enter first three letters of a month (Jan - January, Feb - February... Dec - December): ");

			// Input of month from user
			String monthInput = input.next();

			// Method throws exception if year or month inputs are 0 or less
			// then
			wrongInput(year, monthInput);

			// Scanner object is closed
			input.close();

			// Array of Strings that holds the names of every month in a year
			String[] namesOfMonths = { "January", "February", "March", "April", "May", "June", "July", "August",
					"September", "October", "November", "December" };

			// Variable for storing index of a month
			int month = 0;

			// Adds an index value to the variable month
			for (int i = 0; i < namesOfMonths.length; i++) {

				// If String on specific index of an Array of String values
				// representing month names has same prefix as a month input
				// from user
				// then the index value of that String is added to variable
				// month
				if (namesOfMonths[i].startsWith(monthInput)) {
					month = i;
				}
			}

			// Creating GregorianCalendar object with input from user specified
			// for that year and month only
			GregorianCalendar calendar = new GregorianCalendar(year, month, 1);

			// Output of number of days in a specified month of a year
			System.out.println(
					monthInput + " " + year + " has " + calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH)
							+ " days.");/*
										 * Method that shows actual maximum days
										 * that given month has
										 */

			// catch block catches thrown exception and stops the program from
			// executing
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! Enter the correct format of number.");
		}
	}

	// Method throws new exception if the arguments are less then or
	// equal to 0 or if the String input is a digit
	public static void wrongInput(int n1, String s1) {

		for (int j = 0; j < s1.length(); j++) {
			if (n1 <= 0 || Character.isDigit(s1.charAt(j))) {
				
				// Throws new exception
				throw new InputMismatchException();

			}
		}

	}

}
