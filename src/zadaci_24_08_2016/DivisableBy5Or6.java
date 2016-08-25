
/**********************************************************************************
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 * 
 **********************************************************************************/



package zadaci_24_08_2016;

import java.math.BigInteger;

public class DivisableBy5Or6 {

	public static void main(String[] args) {
		
		//BigInteger object with value of Long.MAX_VALUE
		BigInteger divisable = new BigInteger(Long.MAX_VALUE + "");
		
		//Counts divisable numbers
		int counter = 0;
		
		//Prints a header
		System.out.println("Large numbers divisible by 5 or 6: \n");

		// Checks if numbers are divisable by 2 or 3 and prints them
		while (counter < 10) {

			// Increments big number by 1
			divisable = divisable.add(BigInteger.ONE);
			
			// If the number is divisable by 5 or 6 prints the number
			if (divisable.remainder(new BigInteger("5")) == BigInteger.ZERO
					|| divisable.remainder(new BigInteger("6")) == BigInteger.ZERO) {
				System.out.println(divisable);
				counter++;
			}
		}

	}

}
