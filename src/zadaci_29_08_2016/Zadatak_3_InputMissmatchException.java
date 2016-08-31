
/*********************************************************************************
 * (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 **********************************************************************************/


package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_InputMissmatchException {

	public static void main(String[] args) {
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Code that can throw an exception
		try {
			
			//Prompts user to enter 1st integer
			System.out.println("Enter first integer: ");
			int num1 = input.nextInt();
			
			//Prompts user to enter 2nd integer
			System.out.println("Enter second integer: ");
			int num2 = input.nextInt();
			
			//Sums the numbers
			int sum = num1 + num2;
			
			input.close();
			
			//Prints the result
			System.out.println("The result is: " + num1 + " + " + num2 + " = " + sum);
			
			//Catches an exception, prints a message and returns user to main method
		} catch (InputMismatchException e) {
			System.out.println("Wrong input.Enter only integers as a value.");
			main(args);
		}
	}
}
