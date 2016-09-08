
/******************************************************************************************
 * (Occurrences of a specified character in a string) Write a recursive method that
 * finds the number of occurrences of a specified letter in a string using the following
 * method header:
 * 
 * public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string and a character, and displays the number of
 * occurrences for the character in the string.
 ******************************************************************************************/


package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_3_OccurenceOfCharacter {

	public static void main(String[] args) {

		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompts user to enter a String
		System.out.println("Enter a String and character you want to count: ");
		String str = input.nextLine();
		char ch = input.next().charAt(0);
		
		//Prints result
		System.out.println("Character " + ch + " occurrs: " + count(str, ch) + " time/s");
		
		// Scanner closed
		input.close();
	}

	// Reverses integer
	public static int count(String s, char ch) {

		// If string length is 0 return 0
		if (s.length() == 0) {
			return 0; // base case
			
			//else if character is equal to last character in string recursive call plus 1
		} else if (s.charAt(s.length() - 1) == ch) { 
			return 1 + count(s.substring(0, s.length() - 1), ch);
		
			//else the character is not equal and go on with recursive call 
		} else
			return count(s.substring(0, s.length() - 1), ch);
	}
}
