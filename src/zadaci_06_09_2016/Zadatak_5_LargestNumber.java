
/***************************************************************************************
 * (Find the largest number in an array) Write a recursive method that returns the
 * largest integer in an array. Write a test program that prompts the user to enter a
 * list of eight integers and displays the largest element.
 ***************************************************************************************/

package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_5_LargestNumber {

	public static void main(String[] args) {
		//Scanner object
		Scanner input = new Scanner(System.in);
		//Prompts user to enter a list of integers
		System.out.println("Enter a list of 8 numbers: ");
		//Array to store 8 numbers
		int[] list = new int[8];
		//Adds numbers to the array
		for (int i = 0; i < list.length - 1; i++) {
			list[i] = input.nextInt();
		}
		//Scanner closed
		input.close();
		//Prints the result 
		System.out.println("\nLargest number in the list is: " + maxNumber(list, list.length - 1));
	}
	//Returns largest number in the array
	public static int maxNumber(int[] a, int index){
		//Compares every other number in the array with the last number
		if(index > 0){
			return Math.max(a[index], maxNumber(a, index - 1));//recursive call
		}else
			return a[0];//base case
	}

}
