
/***********************************************************************************************************************
 * 
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 * 
 ***********************************************************************************************************************/




package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	//Scanner for user input

		System.out.println("Enter a ASCII code(number from 0 - 127): ");	//Prompts user to enter ASCII code 

		int code = input.nextInt();			//User input as an integer
		
		//Checks if user entered number less then 0 or larger then 127 and propts him to enter ASCII code again
		//until the number netered is correct
		while (code < 0 || code > 127) {	
			System.out.println("You entered wrong ASCII code number. Enter only number from 0 - 127."
					+ "\nEnter ASCII code: ");
			code = input.nextInt();
		}
		
		char ch = (char) code;				//Type casts user integer input to char type
		
		input.close();				//Scnner closed for user input
		
		
		//Prints character that user input ASCII code is representing
		System.out.print("Character in the ASCII code " + code + " is: " + ch);
	}
}
