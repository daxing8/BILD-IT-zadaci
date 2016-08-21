
/***********************************************************************************************
 * 
 * (Row sorting) Implement the following method to sort the rows in a twodimensional array. 
 * A new array is returned and the original array is intact.
 * 
 * public static double[][] sortRows(double[][] m)
 * 
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix.
 * 
 ***********************************************************************************************/

package zadaci_20_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {

		// Code that can throw an exception
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prompts user to enter first 3x3 integer matrix
			System.out.println("Enter list1: ");

			// 2-D arrays to store the matrix
			double[][] m = new double[3][3];

			// Adds elements to the matrix by user input
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextDouble();
				}
			}
			//Prints header
			System.out.println("\nYour matrix: ");
			
			//Prints unsorted matrix
			printMatrix(m);
			
			// Scanner closed
			input.close();

			// Calls a method to sort every row seperately
			sortRows(m);
			
			//Prints header 
			System.out.println("\nYour matrix sorted: ");
			
			// Prints sorted array on the console
			printMatrix(m);

			// Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only integers.");
		}

	}
	//Prints 2-D array matrix 
	public static void printMatrix(double[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	//Sorts matrix every row seperately and returns sorted 2-D array
	public static double[][] sortRows(double[][] m) {
		
		//Adds value of m to empty array that will be sorted
		double[][] sortArray = m;
		
		//1-D array to store row for sorting
		double[] array = new double[m.length];
		
		//Stores row elements of 2-D array to 1-D array
		for (int i = 0; i < sortArray.length; i++) {
			for (int j = 0; j < sortArray[i].length; j++) {
				array[j] = sortArray[i][j];
			}
			
			//Calls a method to sort array
			Arrays.sort(array);
			
			//Returns the sorted elements to the 2-D array
			for (int j = 0; j < array.length; j++) {
				sortArray[i][j] = array[j];
			}
		}	//returns sorted 2-D array  
		return sortArray;
	}
}
