
/****************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, 
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 * 
 ****************************************************************************************************************/



package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		try {				//Code that can throw an exception
				
			Scanner input = new Scanner(System.in);				//Scanner for user input
			
			System.out.print("Enter the number of pyramid lines: ");		//Prompts user to enter number of lines 
			
			int number = input.nextInt();			//User input
			
			negativeInput(number);			//Checks if user input is a negative number
			
			input.close();			//Scanner closed
			
			for (int i = 1; i <= number; i++) {			//Outer loop prints from number 1 to input number
				for (int j = number; j > i; j--) {	//Inner loop Prints empty space from input number in reverse to 
													//initial variable in outer loop
					System.out.print("  ");
				}
				for (int j = i; j > 0; j--) {		//Prints numbers from inital value of the outer loop in reverse
					System.out.print(j + " ");
				}
				for (int j = 2; j <= i; j++) {		//Second half of the pyramid prints numbers in increasing order
					System.out.print(j + " ");
				}
				System.out.println();			//Transfers to next line
				
			}
			
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only positive integer.");
		}
	}
	//If number entered is less then 0 it throws a new exception
	public static void negativeInput(int n){
		if(n < 0){
			throw new InputMismatchException();
		}
	}
}
