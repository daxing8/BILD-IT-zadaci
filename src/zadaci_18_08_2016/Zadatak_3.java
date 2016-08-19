
/******************************************************************************************
 * 
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same
 * value.
 * 
 * public static boolean isConsecutiveFour(int[] values)
 * 
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series.
 * 
 ******************************************************************************************/



package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		// Code that can throw an exception
				try {

					// Scanner object for user input
					Scanner input = new Scanner(System.in);

					// Prompts user to enter how many numbers he wants to exclude
					System.out.println("Enter the number of values: ");

					// User input
					int n = input.nextInt();

					// Array that stores excluding numbers
					int[] values = new int[n];

					// Prompts user to enter numbers to be excluded
					System.out.println("Enter the values as an integer: ");

					// Inputs numbers to be excluded in to array
					for (int i = 0; i < values.length; i++) {
						values[i] = input.nextInt();
					}
					// Scanner closed
					input.close();

					// Calls a method and prints the return number
					System.out.println("The list " + (isConsecutiveFour(values) ? "has" : "has no") + " consecutive fours.");

					// Catches an exception if it occurs and outputs a message
				} catch (Exception e) {
					System.out.println("Wrong input. Enter only integers.");
				}

	}
	//If array of integers has consecutive four numbers it returns true 
	public static boolean isConsecutiveFour(int[] values){
		
		//Counts consecutive numbers
		int counter = 0;
		
		//Value for comparing
		int compareValue = values[0];
		
		//Checks every value in an array if it is equal to or not to a value next to it
		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < values.length; j++) {
				if(compareValue != values[j]){ //If values are not equal value being compared becomes compare value
					compareValue = values[j];
					if(counter < 3){	//If counter is less then 3 it is set to zero
						counter = 0;						
					}
					//Else values are equal and counter is incremented by 1
				}else
					counter++;
			}
		}
		//If counter is larger than or equal to 3 it is four consecutive numbers
		if(counter >= 3){
			return true;	//Method returns true
		}
		return false;	//In other case it is false
	}
}
