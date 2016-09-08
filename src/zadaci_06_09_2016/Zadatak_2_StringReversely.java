
/****************************************************************************************
 * (Print the characters in a string reversely) Write a recursive method that displays
 * a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba. Write a test program
 * that prompts the user to enter a string and displays its reversal.
 ****************************************************************************************/


package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_2_StringReversely {

	public static void main(String[] args) {
		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompts user to enter a String
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		System.out.println("\nYour string reversed: ");
		
		// Calls a reverseDisplay method
		reverseDisplay(str);

		// Scanner closed
		input.close();
	}

	// Reverses integer
	public static void reverseDisplay(String s) {
		//If string length is 0 exit the method
		if(s.length() == 0){
			return;	// base case
		}else
			System.out.print(s.charAt(s.length() - 1));	//Prints the last character of the string
			reverseDisplay(s.substring(0, s.length() - 1));//recursive call for string without las character
	}

}
