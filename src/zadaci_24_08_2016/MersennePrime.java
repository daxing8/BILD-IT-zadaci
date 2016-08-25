
/****************************************************************************************
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2p - 1 for some positive integer p. Write a program that finds
 * all Mersenne primes with p … 100 and displays the output as shown below.
 * (Hint: You have to use BigInteger to store the number, because it is too big to
 * be stored in long. Your program may take several hours to run.)
 * 
 * p 2^p – 1
 * 2 3
 * 3 7
 * 5 31
 * ...
 * 
 ****************************************************************************************/


package zadaci_24_08_2016;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		
		//Creates BigInteger object to store the value of mersenne prime 
		BigInteger mersennePrime = new BigInteger("0");
		
		//BigInteger object that with value of 2 to be raised to power of p
		BigInteger numberTwo = new BigInteger("2");
		
		//Prints the header 
		System.out.println("p\t2^p – 1\n");
		
		//Checks if number is prime and calculates mersenne prime with formula 
		for (int i = 2; i <= 100; i++) {
			
			//Sets BigInteger object that stores mesenne prime to zero
			mersennePrime = BigInteger.ZERO;
			
			//If number is prime calculate mersenne prime
			if (isPrime(i)) {
				
				//Raises 2 to the power of prime (2^p) 
				mersennePrime = numberTwo.pow(i);
				
				//Subtracts 1 from calculation 2^p to get the full formula 2^p – 1
				mersennePrime = mersennePrime.subtract(BigInteger.ONE);
				
				//Prints prime and mersenne prime numbers
				System.out.println(i + "\t" + mersennePrime);
			}
		}
	}
	//Checks if a number is prime
	public static boolean isPrime(int number) {
		
		//If number passed as argument is divisible by other than himself and 1 return false
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}//Otherwise return true
		return true;
	}
}
