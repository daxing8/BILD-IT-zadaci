
/***********************************************************************************************************************
 * 
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, iskljuèujuæi sebe. 
 * Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.
 * 
 ***********************************************************************************************************************/



package zadaci_08_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		//Writes a header on the console
		System.out.println("Perfect numbers in the span of 1 to 10000 are: \n");

		// Checks every number from 1 to 10000 if it is a perfect number
		for (int i = 1; i <= 10000; i++) {
			perfectNumbers(i); // Calls the method and passes number as an argument
		}
	}

	// Method checks if the number is perfect and writes it out on the console
	public static void perfectNumbers(int number) {// Takes one type integer
													// number as an argument

		// Variable for storing sum of positive divisors
		int sum = 0;

		// Checks if the number is divisible
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {// if the number is divisible it is added to
									// the sum variable
				sum += i;
			}
		}
		// if sum of positive divisors is equal to number being checked then it
		// is a perfect number
		if (sum == number) {
			// number is written on the console
			System.out.print(" " + number);

		}

	}

}
