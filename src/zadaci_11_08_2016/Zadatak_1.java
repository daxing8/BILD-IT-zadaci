
/**************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
 * program vraæa Atlanta, Chicago, Los Angeles.
 * 
 **************************************************************************************************/

package zadaci_11_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {
	// Main method throws an exception
	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {

			// Scanner object created for user input
			Scanner input = new Scanner(System.in);

			// Prints instructions for user input
			System.out.println("Enter a name of the first city(first letter upper case): ");

			// User input
			String city1 = input.nextLine();

			// If first letter of user input is lower case it is changed to
			// upper
			// case
			city1 = city1.substring(0, 1).toUpperCase() + city1.substring(1);
			
			//Calls a method to check if the first user input is correct
			wrongInput(city1);
			
			// Prints instructions for second user input
			System.out.println("Enter a name of the second city(first letter upper case): ");

			// Second user input
			String city2 = input.nextLine();
			
			////Calls a method to check if the second user input is correct
			wrongInput(city2);
			
			// If first letter of second user input is lower case it is changed
			// to
			// upper case
			city2 = city2.substring(0, 1).toUpperCase() + city2.substring(1);

			// Prints instructions for third user input
			System.out.println("Enter a name of the third city(first letter upper case): ");

			// Third user input
			String city3 = input.nextLine();
			
			//Calls a method to check if the third user input is correct
			wrongInput(city3);
			
			// If first letter of third user input is lower case it is changed
			// to
			// upper case
			city3 = city3.substring(0, 1).toUpperCase() + city3.substring(1);

			// Scanner object closed for user input
			input.close();

			// Creates an Array of strings that store three user input cities
			String[] cities = { city1, city2, city3 };

			// Calls a method that sorts the cities in correct alphabetical
			// order
			Arrays.sort(cities);

			// Prints a header for sorted cities
			System.out.println("\nCities sorted in alphabetical order: ");

			// Prints all the cities in the alphabetical order separated with
			// one space
			for (String print : cities) {
				System.out.print(print + " ");
			}

			// Catches exception if it occurs or is thrown and prints a message
			// to user
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only string type input.");
		}
	}
	
	//Method checks if string argument contains a digit and if it does it throws an exception 
	public static void wrongInput(String str) {
		
		//Checks every character in a string 
		for (int i = 0; i < str.length(); i++) {
			
			//If character is a digit it throws an InputMismatchException
			if (Character.isDigit(str.charAt(i))) {
				
				//Throws new exception
				throw new InputMismatchException();
			}
		}
	}
}
