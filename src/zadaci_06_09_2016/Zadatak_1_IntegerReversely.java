
/****************************************************************************************
 * (Print the digits in an integer reversely) Write a recursive method that displays
 * an int value reversely on the console using the following header:
 * 
 * public static void reverseDisplay(int value)
 * 
 * For example, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal.
 ****************************************************************************************/


package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_1_IntegerReversely {

	public static void main(String[] args) {
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter an integer
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		//Calls a reverseDisplay method 
		reverseDisplay(n);
		
		//Scanner closed
		input.close();
	}
	//Reverses integer
	public static void reverseDisplay(int n){
		//If number is less then two digits prints base case
		if(n < 10){
			System.out.print(n); //Base case
		}else{
			System.out.print(n % 10);	//Prints last digit
			reverseDisplay(n / 10);	// recursion call 
		}
	}

}
