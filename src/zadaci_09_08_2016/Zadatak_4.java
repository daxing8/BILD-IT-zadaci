package zadaci_09_08_2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		//If an exception occurs in the try block it is send to catch block to be handled
		try {
			
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Prompt a message for user to input integers and 0 ends the input
			System.out.println("Enter unspecified number of integers (0 ends input): ");
			
			//User input
			int numbers = input.nextInt();
			
			//ArrayList of integer objects created
			ArrayList<Integer> numberList = new ArrayList<>();
			
			//Add integers to ArrayList while integer is not 0
			while (numbers != 0) {
				numberList.add(numbers);//Adds numbers to ArrayList
				numbers = input.nextInt();//Prompts the user to enter another number
			}
			
			//Scanner object is closed
			input.close();
			
			//Array of Integer objects is created with the size of ArrayList numberList
			Integer[] arrayOfNumbers = new Integer[numberList.size()];
			
			//ArrayList of numbers is transfered to empty Array of same size
			numberList.toArray(arrayOfNumbers);
			
			//Calls the method to sort Array of integers in increasing order (largest number last)
			Arrays.sort(arrayOfNumbers);
			
			//Calls a method that finds the max number and how many times he occurs in an Array
			numberCounter(arrayOfNumbers);
			
			//Catches an exception, stops the program from executing further and sends a message
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! Enter only integers.");
		}

	}
	
	//Method takes one argument as an Array of integers and finds the max number and it's occurrence
	public static void numberCounter(Integer[] array) {
		
		//Adds last number(which is the largest) of the array to variable  
		int maxNum = array[array.length - 1];
		
		//Counts how many times largest number occurs in an array
		int counter = 0;
		
		//Checks every element of array if it is equal to largest number
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxNum) {//If it is equal counter increments by one
				counter++;
			}
		}
		
		//Prints the largest number and number of it's occurrence in array
		System.out.println(
				"Largest number in the list is: " + maxNum + "\nNumber of occurence in the list is: " + counter);
	}

}
