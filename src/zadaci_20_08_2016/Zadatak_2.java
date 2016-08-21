
/******************************************************************************************
 * 
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * 
 * public static boolean equals(int[][] m1, int[][] m2)
 * 
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical.
 * 
 *******************************************************************************************/

package zadaci_20_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2 {
	
	public static void main(String[] args) {
		// Code that can throw an exception
				try {

					// Scanner object for user input
					Scanner input = new Scanner(System.in);

					// Prompts user to enter first 3x3 integer matrix
					System.out.println("Enter list1: ");

					// 2-D arrays to store the matrix
					int[][] m1 = new int[3][3];
					int[][] m2 = new int[3][3];

					// Adds elements to the matrix by user input
					for (int i = 0; i < m1.length; i++) {
						for (int j = 0; j < m1[i].length; j++) {
							m1[i][j] = input.nextInt();
						}
					}
					// Prompts user to enter second 3x3 matrix
					System.out.println("Enter list2: ");

					// Adds elements from user input to a matrix
					for (int i = 0; i < m2.length; i++) {
						for (int j = 0; j < m2[i].length; j++) {
							m2[i][j] = input.nextInt();
						}
					}

					// Scanner closed
					input.close();

					// Prints out if two arrays are identical or not
					System.out.println("The two arrays " + (equals(m1, m2) ? "are" : "are not") + " strictly identical.");

					// Catches an exception and prints a message
				} catch (Exception e) {
					System.out.println("Wrong input. Enter only integers.");
				}
			}

			// Checks if two arrays are equal
			public static boolean equals(int[][] m1, int[][] m2) {

				// retuns a method in the Arrays class that compares two array objects
				// and returns true if they are equal or false if they are not
				return Arrays.deepEquals(m1, m2);
	}
}
