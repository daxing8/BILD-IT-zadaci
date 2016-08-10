
/****************************************************************************************************************************
 * 
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. Metoda treba da koristi sljedeæi header: 
 * 
 * public static int count(String str, char a). 
 * 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu 
 * te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 * 
 ***************************************************************************************************************************/

package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {

		// If an exception occurs in the try block it is send to catch block to
		// be handled
		try {
			
			//Scanner object created for user input
			Scanner input = new Scanner(System.in);
			
			//Prints a message for user to input a string
			System.out.println("Enter a string: ");
			
			//user input
			String s = input.nextLine();
			
			//Prints a message for user to input a character
			System.out.println("Enter a character: ");
			
			//user input
			char ch = input.next().charAt(0);
			
			//Calls a method which checks if user input is a digit instead of string and char type
			wrongInput(s, ch);
			
			//Scanner closed for user input
			input.close();
			
			//Calls a method to count number of character repeats in a string and prints a return result 
			System.out.println("Number of times character " + ch + " is repeated in a string is: " + count(s, ch));

			// Catches input mismatch exception by user
			// Stops the program from executing and prints a warning message
		} catch (InputMismatchException e) {
			System.out.println("Wrong input. Enter only string and character type input.");
		}
	}

	// Method that checks if string input from user is a digit
	public static void wrongInput(String s, char ch) {

		// Checks every character in a string
		for (int j = 0; j < s.length(); j++) {
			// If character in a string is a digit it throws a new exception
			if (Character.isDigit(s.charAt(j)) || Character.isDigit(ch)) {

				// Throws an exception
				throw new InputMismatchException();
			}
		}
	}
	
	//Method counts how many time a character is repeated in a string
	public static int count(String str, char ch) {
		
		//Counts characters
		int characterCounter = 0;
		
		//Goes throw every character in a string to see if they are equal
		for (int i = 0; i < str.length(); i++) {
			
			//If characters are equal counter is incremented by 1
			if (str.charAt(i) == ch) {
				characterCounter++;//counter increments by one
			}
		}
		//Returns total of character repeats in a string
		return characterCounter;
	}
}
