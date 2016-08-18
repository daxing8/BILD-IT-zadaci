
/************************************************************************************************
 * Napisati program koji prima karakter te vraæa njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.
 * 
 *************************************************************************************************/



package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);			//Scanner object for user input
		
		System.out.println("Enter a character: ");		//Propts user to enter a character
		
		char ch = input.next().charAt(0);	//Takes first character of a string input and adds it to char type variable
		
		input.close();				//User input closed
		
		//Prints ASCII code for user input character
		System.out.println("ASCII code for character " + ch + " is:  " + (int)ch);
	}
}
