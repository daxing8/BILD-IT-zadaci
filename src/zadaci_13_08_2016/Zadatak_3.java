package zadaci_13_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		//Number of reverse primes to be printed
		final int REVERSE_PRIMES = 100;
		
		int counter = 0;									//Counts number of primes
		
		int number = 10;									//Starting number to be checked if it is prime
		
		//Loops until the set number of primes is reached
		while (counter < REVERSE_PRIMES) {
			
			//If the number is prime and prime in reverse also print it
			if (isPrime(number) && isPrime(reverse(number))) {
				counter++;												//Counter increments by 1
				
				System.out.print(" " + number);							//Prints a number with one empty space 
				
				//Transfers primes to new line after 10 numbers are printed 
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			number++;													//Number for checking is incremented by 1
		}
	}
		
	public static boolean isPrime(int number) {							//Method checks if a number is prime
		
		for (int i = 2; i <= number / 2; i++) {		//If a number is divisible with other numbers 
													//then himself and one it is not a prime	
			if (number % i == 0) {					 				
				return false;						//Returns false
			}
		}

		return true;								//If number is prime return true
	}

	
	public static int reverse(int number) {			//Method reverses an integer

		int reverse = 0;							//Stores reversed number 
		
		int digit;									//Stores one digit of a number

		while (number != 0) {						//Loops until number becomes a zero
			
			digit = number % 10;					//Last digit of a number is added to variable 
			
			reverse = reverse * 10 + digit;			//Stores digit by digit in reverse
			
			number /= 10;							//Last digit is subtracted from a number
		}

		return reverse;								//Returns a number in reverse
	}

}
