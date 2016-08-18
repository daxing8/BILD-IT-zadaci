
/**************************************************************************************************************
 * U javi, short vrijednost se sprema u samo 16 bita. 
 * Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
 * 
 **************************************************************************************************************/



package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompts user to enter a short number
		System.out.println("Enter short type number: ");

		// User input
		short s = input.nextShort();

		// Scanner closed
		input.close();

		// String representation of binary value formatted to show all 16 bits
		// of short number
		// number is cast to unsigned integer and uses Integer class method to
		// print binary value
		String s1 = String.format("%16s", Integer.toBinaryString(s & 0xFF)).replace(' ', '0');

		// Prints binary code for certain number
		System.out.print("Binary representation of number " + s + " is: " + s1);
	}
}
