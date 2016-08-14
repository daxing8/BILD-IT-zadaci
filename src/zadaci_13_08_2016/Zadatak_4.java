package zadaci_13_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		//Number of palindromic primes to be printed
		final int NUMBER_OF_PRIME_PALINDROMES = 100;
		
		int counter = 0;										//Counts number of primes
		
		int number = 10;										//Starting number to be checked if it is prime

		while (counter < NUMBER_OF_PRIME_PALINDROMES) {			//Loops until the set number of primes is reached
			
			if (isPrime(number) && isPalindrome(number)) {		//If a number is prime and palindrome print a number
				
				counter++;										//Counts palindromic primes

				System.out.print(number + " ");					//Prints a palindromic prime
				
				if (counter % 10 == 0) {						//Transfers to a new line if numbers count reached 10
					System.out.println();		
				}
			}
			number++;											//Number for checking is incremented by 1
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

	public static boolean isPalindrome(int number) {	//Method checks if a number is palindrome

		return (number == reverse(number));				//if number is same as in reverse return true

	}

}
