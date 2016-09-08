
/**********************************************************************************
 * (Sum the digits in an integer using recursion) Write a recursive method that
 * computes the sum of the digits in an integer. Use the following method header:
 * 
 * public static int sumDigits(long n)
 * 
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
 * that prompts the user to enter an integer and displays its sum.
 ***********************************************************************************/


package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_4_SumDigits {

	public static void main(String[] args) {

		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompts user to enter an integer
		System.out.println("Enter an integer: ");
		long n = input.nextInt();

		// Calls a sumDigit method
		System.out.println(sumDigits(n));

		// Scanner closed
		input.close();
	}

	// Returns sum of digits in integer
	public static int sumDigits(long n) {
		
		// If number is less then two digits prints base case
		if (n < 10) {
			return (int)n; // Base case
		} else {
		int	sum = (int)n % 10;
		return sum + sumDigits(n / 10); // recursion call
		}
	}

}
