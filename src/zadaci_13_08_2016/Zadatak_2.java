package zadaci_13_08_2016;

import java.util.InputMismatchException;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		//If the exception occurr's in the try block it is sent to catch block
		try {
			
			//Scanner object for user input created
			java.util.Scanner input = new java.util.Scanner(System.in);
			
			//Prompts the user to enter an integer
			System.out.println("Enter an integer: ");

			int num = input.nextInt();		//User input
									
			negativeInput(num);				//Method call that checks if user input is negative
			
			input.close();					//Scanner closed
			
			reverse(num);					//Calls a method that reverses the number
			
			
			//Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only positiv integers. ");	
		}
	}
	
	//Method takes 1 integer as an argument and prints a number in reverse
	public static void reverse(int n){
		
		int reversed = 0;					//Variable to store one digit from an integer
		
		System.out.println("Your number reversed: ");	//Prints a message 
			
		//Until a number is 0 it will loop
		while(n != 0){
			reversed = n % 10;				//Remainder of a number divided with ten is a last digit of a number
			
			n /= 10;						//Takes a last digit of a number
			
			System.out.print(reversed);		//Outputs digit by digit from last to first
		}
	}
	
	//Method that checks if user input is less then or equal to 0
		public static void negativeInput(int n) {
			
			//if a number is less then or equal to 0 it throws an exception
			if (n <= 0) {
				
				//Throws new exception
				throw new InputMismatchException();
			}
		}
}
