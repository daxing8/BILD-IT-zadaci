
/***********************************************************************************************************************
 * 
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napisati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 * 
 ***********************************************************************************************************************/




package zadaci_12_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {

		// Counts number of primes
		int counter = 0;

		// Checks every number up to 100000 if it is prime
		for (int i = 2; i <= 100000; i++) {

			/*
			 * Calls a method to check if the number is prime If it is prime it
			 * will return 1
			 */
			if (isPrime(i) == 1) {

				// If number is prime prints number separated with one space
				System.out.print(" " + i);
				counter++;// counter is incremented by one
			}
			// If the number of primes is 10 transfer to next line
			if (counter == 10) {
				System.out.println();// Transfers to next line

				counter = 0;// Counter is set to zero
			}
		}
	}

	// Method receives one integer as an argument and checks if the number is
	// prime
	public static int isPrime(int number) {

		// Checks if a number is prime
		for (int i = 2; i < number; i++) {

			// If a number is divisible with number other then himself and 1 it
			// is not a prime
			if (number % i == 0) {
				return 0;// if it is not a prime it returns number 0
			}
		}
		// if number is prime it returns number 1
		return 1;
	}

}
