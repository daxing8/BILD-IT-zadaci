
/****************************************************************************************************
 * 
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
 * 
 ****************************************************************************************************/


package zadaci_11_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		//Counts prime numbers
		int counter = 0;
		
		//Checks every number from 2 to 1000 including both numbers if they are prime
		for (int i = 2; i <= 1000; i++) {
			
			//Calls a method to check if the number is prime
			if(isPrime(i)){
				
				//If number is prime prints number with divided with one space
				System.out.print(" " + i);
				counter++;//counter is incremented by one
			}
			//If the number of primes is 8 transfer to next line
			if(counter == 8){
				System.out.println();//Transfers to next line
				
				counter = 0;//Counter is set to zero
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
