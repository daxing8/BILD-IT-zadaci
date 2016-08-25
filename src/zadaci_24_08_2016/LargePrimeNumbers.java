
/******************************************************************************
 * (Large prime numbers) Write a program that finds five prime numbers larger
 * than Long.MAX_VALUE.
 * 
 ******************************************************************************/


package zadaci_24_08_2016;

import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {

		// BigInteger object with value of Long.MAX_VALUE
		BigInteger primeNumber = new BigInteger(Long.MAX_VALUE + "");

		// Counts number of primes
		int counter = 0;
		
		//Prints a header
		System.out.println("Prime numbers greater than Long.MAX_VALUE: \n");
		
		// While counter is less then 5 loop
		while (counter < 5) {

			// Adds number 1 to the BigInteger number
			primeNumber = primeNumber.add(BigInteger.ONE);

			// Checks if number is probably prime returns true if it is false if
			// it is not
			if (primeNumber.isProbablePrime(1)) {
				System.out.println(primeNumber); // Prints the number
				counter++; // Counter increments
			}
		}
	}

}
