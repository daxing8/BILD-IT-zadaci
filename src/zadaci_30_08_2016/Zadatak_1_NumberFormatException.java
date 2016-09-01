
/**************************************************************************
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 **************************************************************************/



package zadaci_30_08_2016;

import java.util.Scanner;

public class Zadatak_1_NumberFormatException {

	public static void main(String[] args) {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter binary number
		System.out.println("Enter a binary number(ex. 1011): ");
		
		//Code that can throw an exception
		try {
			//Binary string
			String binary = input.nextLine();
			//Calls a method and prints a result or throws an exception
			System.out.println("Decimal representation of binary number: " + bin2Dec(binary));
			
			//Catches an exception, prints a message and returns to main method
		} catch (NumberFormatException e) {
			System.out.println("Error! Your number format is not binary. Please try again.");
			main(args);
		}
		
		//Scanner closed
		input.close();
	}
	//Returns binary string as decimal or throws an exception
	public static double bin2Dec(String binaryString) {
		
		//Checks if binary string is binary or not
		for (int i = 0; i < binaryString.length() - 1; i++) {
			//If number is larger than 1 or less then 0 it is not a binary string
			if (binaryString.charAt(i) > '1' || binaryString.charAt(i) < '0') {
				//Throws new NumberFormatException
				throw new NumberFormatException();
			}
		}
		//Returns binary string as a decimal number
		return Double.parseDouble(binaryString);
	}
}
