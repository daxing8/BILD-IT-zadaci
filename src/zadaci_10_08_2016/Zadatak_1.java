
/***************************************************************************************
 * 
 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: 
 * 
 * public static int numberOfDayInAYear(int year). 
 * 
 * Napisati program koji pita korisnika da unese poèetnu godinu, 
 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
 * 
 ***************************************************************************************/



package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		//If an exception occurs in the try block it is send to catch block to be handled
		try {
			
			//Creates Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Prints a message for user to enter start year
			System.out.println("Enter start year: ");
			
			//User input
			int startYear = input.nextInt();
			
			//Prints a message for user to enter end year
			System.out.println("Enter end year: ");
			
			//User input
			int endYear = input.nextInt();
			
			//Calls a method that throws an exception if user input is a negative number
			negativeInput(startYear, endYear);
			
			//Scanner closed
			input.close();
			
			//Empty line to separate user input from console output
			System.out.println();
			
			//Sends every year in user input span to method that checks and returns how many days a year has
			for (int i = startYear; i <= endYear; i++) {
				System.out.println("Year " + i + " has: " + numberOfDayInAYear(i) + " days.");
			}
			
			//Catches exception if it occurs or is thrown and prints a message to user
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only positive integers.");
		}
	}
	
	
	//Method takes two integers as an argument and checks if numbers are negative
	public static void negativeInput(int n1, int n2) {
		
		//If numbers are less than zero throw an exception
		if (n1 < 0 || n2 < 0) {
			
			//Throws exception
			throw new InputMismatchException();
		}
	}
	
	//Method takes one integer as an argument and returns a number of days that a year has
	public static int numberOfDayInAYear(int year) {
		
		//If the year is not a leap year return 365 days
		if (isLeapYear(year) == false) {//Calls a method to check if a year is a leap year
			return 365;
		} else	//in the other case return 366 days
			return 366;
	}
	
	//Method takes one integer and checks if a year is leap
	public static boolean isLeapYear(int year) {
		
		//If a year is divisable by 4 and not divisable by 100, or if the year is divisable by 400 it is a leap year
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			
			//year is a leap year return true
			return true;
		} else
			return false;//year is not a leap year return false	
	}
}
