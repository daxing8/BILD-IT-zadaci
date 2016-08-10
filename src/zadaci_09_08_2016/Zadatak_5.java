package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prints directions for user input
			System.out.println("Enter number of milliseconds you want to convert to hours, minutes and seconds: ");

			// User input stored
			long milliseconds = input.nextLong();

			// Prints and calls a method that converts milliseconds to time
			// format
			System.out.println(convertMillis(milliseconds));

			// Scanner closed
			input.close();

			// Catches an exception, stops the program from executing further
			// and sends a message
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only long number.");
		}

	}

	// Method takes one number of type long as an argument and converts it to
	// time units(hours, minutes, seconds)
	public static String convertMillis(long millis) {

		// Divides given milliseconds with 1000 to get number of seconds
		long seconds = millis / 1000;

		// Divides number of seconds with 60 to get number minutes
		long minutes = seconds / 60;

		// Divides number of minutes with 60 to get correct hours
		long hours = minutes / 60;

		// Creates a string with converted time units
		String timeFormat = hours + ":" + minutes % 60 + ":" + seconds % 60;// Modulo
																			// division
																			// of
																			// minutes
																			// and
																			// seconds
																			// by
																			// 60
																			// gives
																			// the
																			// correct
																			// minutes
																			// and
																			// seconds
		return timeFormat;//Returns String with converted time units
	}

}
