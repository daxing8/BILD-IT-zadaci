
/**************************************************************************************************************************
 * 
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
 * Koristite sljedeæi header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 * 
 **************************************************************************************************************************/



package zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
	
		//Code that can throw an exception
		try {
			
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
				
			//Propts user to enter an integer
			System.out.println("Enter integer with more than 1 digit: ");
			
			//User input
			int number = input.nextInt();
			
			//Scanner closed
			input.close();
			
			//Outputs a sum of all digits in number 
			System.out.println("Sum of all digits in number is: \n" + sumDigits(number));
			
			//Prints a message if exception occurrs
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only integer.");
		}
	}
	//Sums all digits of the number passed as argument
	public static int sumDigits(int n){
		
		//Transfers an integer to String
		String numberString = n + "";
		
		//Stores a sum of numbers
		int sum = 0;
		
		//Sums all numbers in a String
		for (int i = 0; i < numberString.length(); i++) {
			sum += numberString.charAt(i) - '0';
		}
		//Returns a sum
		return sum;
	}
}
