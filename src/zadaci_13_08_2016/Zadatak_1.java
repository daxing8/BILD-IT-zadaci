package zadaci_13_08_2016;

import java.util.InputMismatchException;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		//If the exception occurr's in the try block it is sent to catch block 
		try {
			
			//Scanner object for user input created
			java.util.Scanner input = new java.util.Scanner(System.in);
			
			//Prompts the user to enter the invoice amount
			System.out.println("Enter invoice amount: ");

			double invoice = input.nextDouble();		//User input
			
			//Prompts the user to enter the tip amount in percent
			System.out.println("Enter tip amount in percent(e.g. 15 = 15%):  ");
			
			double tip = input.nextDouble() / 100;		//User input divided by 100 to get the percentage value 
			
			//Method call to check if user input is less then 0
			negativeInput(invoice, tip);
			
			//Scanner object closed
			input.close();
			
			//Calculates the tip from the invoice amount
			double tipAmount = invoice * tip;
			
			//Adds tip amount to the invoice amount
			double invoiceWithTip = tipAmount + invoice;
			
			//Prints total invoice amount and tip amount
			System.out.println("Your total invoice amount is: " + invoiceWithTip  
					+ "\nAmount of your tip: " + tipAmount);
			
			//Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only positive decimal numbers.");
		}
	}
	
	//Method that checks if user inputs are less then 0
	public static void negativeInput(double n1, double n2) {
		
		//if one of the numbers is less then 0 it throws an exception
		if (n1 < 0 || n2 < 0) {
			
			//Throws new exception
			throw new InputMismatchException();
		}
	}
}
