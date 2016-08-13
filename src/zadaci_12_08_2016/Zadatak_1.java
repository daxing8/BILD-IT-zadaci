
/********************************************************************************** 
 * 
 * Pretpostavimo da se registarska tablica za auto 
 * sastoji od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 * 
 **********************************************************************************/

package zadaci_12_08_2016;

import java.util.Random;

public class Zadatak_1 {

	public static void main(String[] args) {

		// Creates random class object for generating random numbers
		Random random = new Random();

		// Generates random upper case letter for 3 variables
		char ch1 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
		char ch2 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
		char ch3 = (char) ('A' + Math.random() * ('Z' - 'A' + 1));

		// Prints a random generated license plate number
		System.out.println("License plate number: \n" + ch1 + "" + ch2 + "" + ch3 + "-" + random.nextInt(10) + ""
				+ random.nextInt(10) + "" + random.nextInt(10) + random.nextInt(10));
	}
}
