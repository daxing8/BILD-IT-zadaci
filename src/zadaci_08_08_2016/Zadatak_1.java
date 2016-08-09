
/*******************************************************************************************************
 * 
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
 * 
 *******************************************************************************************************/

package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws InputMismatchException {

		try {
			// Scanner object created for users input
			Scanner input = new Scanner(System.in);

			// Variables with random integer value
			int num1 = 1 + (int) (Math.random() * 10);
			int num2 = 1 + (int) (Math.random() * 10);
			int num3 = 1 + (int) (Math.random() * 10);

			// Output message for user
			System.out.println("What is the result of: \n" + num1 + " + " + num2 + " + " + num3 + "?");

			// Users input
			int result = input.nextInt();

			// While result is not correct ask user the same question and ask
			// for answer
			while (result != (num1 + num2 + num3)) {

				// Output message again for the user
				System.out.println("Try again! What is the result of: \n" + num1 + " + " + num2 + " + " + num3 + "?");

				result = input.nextInt();

			}

			// Output message to congratulate user on his correct answer
			System.out.println("Congratulations! That is a correct answer.");

			// Scanner input is closed
			input.close();

		} catch (InputMismatchException e) {
			System.out.println("Wrong input! Enter only integers!");
		}

	}

}
