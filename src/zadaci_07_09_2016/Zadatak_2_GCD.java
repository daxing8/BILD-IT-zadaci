
/***********************************************************************************
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
 * be defined recursively as follows:
 * ■ If m % n is 0, gcd(m, n) is n.
 * ■ Otherwise, gcd(m, n) is gcd(n, m % n).
 * 
 * Write a recursive method to find the GCD. Write a test program that prompts the
 * user to enter two integers and displays their GCD.
 ************************************************************************************/


package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_2_GCD {

	public static void main(String[] args) {
		//Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter two integers
		System.out.print("Enter two integers: ");
		int m = input.nextInt();
		int n = input.nextInt();

		// Calls a method and prints GCD
		System.out.println("The greatest common divisor for number " + m + " and " + n + " is: " + gcd(m, n));
		
		//Scanner object closed
		input.close();
	}

	//Returns greatest common divisor
	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n; // Base case
		else // Recursive call
			return gcd(n, m % n);
	}

}
