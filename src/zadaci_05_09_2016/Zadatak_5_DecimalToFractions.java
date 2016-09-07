package zadaci_05_09_2016;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak_5_DecimalToFractions {

	public static void main(String[] args) {
		//Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a decimal number
		System.out.print("Enter a decimal number: ");
		String[] decimal = input.nextLine().split("[,]");

		// Create a Rational object of the integer part of the decimal number
		RationalBigInteger r1 = new RationalBigInteger(new BigInteger(decimal[0]), BigInteger.ONE);

		// Create a Rational object of the fractional part of the decimal number
		RationalBigInteger r2 = new RationalBigInteger(new BigInteger(decimal[1]), new BigInteger(
			String.valueOf((int)Math.pow(10, decimal[1].length()))));

		// Display fraction number
		System.out.println("The fraction number is " + 
			(decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
		
		input.close();
	}

}
