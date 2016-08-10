
/*****************************************************************************************************************
 * 
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. 
 * Broj mogu�ih kombinacija je 21. 
 * 
 *****************************************************************************************************************/

package zadaci_10_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {

		// Counts combinations
		int counter = 0;

		// Outer loop goes from number 1 and is checked with every number in
		// inner loop
		for (int i = 1; i <= 7; i++) {

			// Inner loop starts from initial value of outer loop plus 1
			for (int j = i + 1; j <= 7; j++) {

				// if numbers are not equal then they are a combination
				if (i != j) {

					// Prints number combination
					System.out.println(i + " " + j);
					counter++;// Combination counter is incremented by 1
				}
			}
		}
		// Prints number of combination in given span of numbers (from 1 to 7)
		System.out.println("\nNumber of combinations is: " + counter);
	}

}
