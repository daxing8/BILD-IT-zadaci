package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {
			
			//Scanner object created for user input
			Scanner input = new Scanner(System.in);
			
			//Prints on console instructions for user input
			System.out.println("Enter number of minutes: ");
			
			//User input
			long minutes = input.nextLong();
			
			//Method call that checks if a number entered by user is negative or a 0
			negativeInput(minutes);
			
			//Scanner closed
			input.close();
			
			//Calls a method and prints result of calculation
			System.out.println(toYearsAndDays(minutes));

			// Catches exception if it occurs or is thrown and prints a message
			// to user
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only long positive numbers.");
		}

	}
	
	//Method takes long number of minutes and calculates how much is that in years and days
	public static String toYearsAndDays(long min) {
		
		//Calculates hours by dividing minutes entered by user
		long hours = min / 60;
		
		//Calculates days by dividing number of hours with number of hours in a day
		long days = hours / 24;
		
		//Calculates remaining hours that are left
		hours %= 24;
		
		//Calculates years by dividing days with number of days in a year
		long years = days / 365;
		
		//Gets the remaining days left
		days %= 365;
		
		//Returns calculated result as a String
		return "Minutes you have entered are: " + years + " year/s and " + days + " days";

	}

	//Method checks if user input is a negative number or a zero
	public static void negativeInput(long n) {
		
		//If number is equal to or less then a zero throw an exception
		if (n <= 0) {
			//Throws exception
			throw new InputMismatchException();
		}
	}

}
