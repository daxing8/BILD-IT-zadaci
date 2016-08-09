
/*******************************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. 
 *
 *******************************************************************************************************************************/

package zadaci_08_08_2016;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {

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
			System.out.println("Enter a month of a year (1 - January, 2 - February... 12 - December): ");

			// Input of month from user
			int month = input.nextInt();

			// Method throws exception if year or month inputs are 0 or less
			// then
			wrongInput(year, month);

			// Creating GregorianCalendar object with input from user specified
			// for
			// that year and month only
			GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);

			// Scanner object is closed
			input.close();

			// Array of Strings that holds the names of every month in a year
			String[] namesOfMonths = { "January", "February", "March", "April", "May", "June", "July", "August",
					"September", "October", "November", "December" };

			// Output of number of days in a specified month of a year
			System.out.println(namesOfMonths[month - 1] + " " + year + " has "
					+ calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH) + " days.");/* Method
																							* that
																							* shows
																							* actual maximum days
																							* that given month has
																							*/

			// catch block catches thrown exception and stops the program from
			// executing
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! Enter the correct format of number.");
		}
	}

	// Method throws new exception if the arguments are less then or
	// equal to 0
	public static void wrongInput(int n1, int n2) {
		if (n1 <= 0 || n2 <= 0) {

			// Throws new exception
			throw new InputMismatchException();
		}

	}
}
