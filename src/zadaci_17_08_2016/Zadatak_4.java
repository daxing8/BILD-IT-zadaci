
/************************************************************************************************************************
 * 
 * Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) 
 * koja vraæa string broja sa prefiksom od jedne ili više nula. 
 * Velièina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 * Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 * 
 *************************************************************************************************************************/



package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		
		try {	//Code that can throw an exception
			
			Scanner input = new Scanner(System.in);		//Scanner for user input
			
			System.out.println("Enter a number and it's width: ");		//Prompts user to enter a number and width
			
			int n = input.nextInt();		//User input of number
			
			int width = input.nextInt();		//User input of numbers width
			
			input.close();		//Scanner object closed
			
			System.out.println("Number formated: " + format(n, width));		//Calls a method to format number and it's width
			
		} catch (Exception e) {			//If Exception occurrs output this message
			System.out.println("Wrong input. Enter only integers. ");
		}
	}

	public static String format(int number, int width) {		//Number is formated and zeros are added to its width 
		
		String str = String.format("%0" + width + "d", number);		//Formate string by adding 0's and number to it's width 
		
		if (str.length() > width) {				//If length of a number is larger than it's width 
												//return string representation of a number without 0's
			return Integer.toString(number);
		}
		return str;		//returns formated string representation of a number
	}
}
