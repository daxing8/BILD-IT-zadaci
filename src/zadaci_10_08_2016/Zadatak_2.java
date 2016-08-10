
/**************************************************************************************************
 * 
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 
 * 
 ***************************************************************************************************/




package zadaci_10_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		//Prints a header before twin primes
		System.out.println("All twin primes smaller than 10000: \n");
		
		//Calls a method to print all twin prime numbers smaller than 10000
		twinPrimes(10000);
	}
	
	//Method takes one integer as an argument and prints all twin primes smaller than 10000 
	public static void twinPrimes(int n){
		
		//Counts number of twin primes per line
		int counter = 0;
		
		//Checks every number from 2 to 10000 if it is a twin prime
		for (int i = 2; i < n; i++) {
			
			//If the numbers are both prime and they are 2 more or 2 less then another prime number
			if (isPrime(i) && isPrime(i + 2)) {
				counter++;//Counter increments by one if the numbers are twin primes
				
				//Prints twin primes on console
				System.out.print("(" + i + " " + (i + 2) + ")");
				
				//If counter is divisible by 10 go to next line
				if (counter % 10 == 0) {
					System.out.println();//Transfers to a new line
				}
			}
		}
	}
	
	//Method receives one integer as an argument and checks if the number is prime
	public static boolean isPrime(int number) {
		
		//Sets prime variable to false
		boolean prime = true;
		
		//Checks if a number is prime
		for (int i = 2; i < number; i++) {
			
			//If a number is divisible with number other then himself and 1 it is not a prime
			if (number % i == 0) {
				prime = false;//sets prime to false
				break;//exits the loop
			}
		}
		//returns boolean true if it is a prime and false if it is not
		return prime;
	}
}
