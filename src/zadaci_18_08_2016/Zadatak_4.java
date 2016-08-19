
/*********************************************************************************************
 * 
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * 
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column. 
 * Here is a sample run:
 * 
 * Enter a 3-by-4 matrix row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * 
 * Sum of the elements at column 0 is 16.5
 * Sum of the elements at column 1 is 9.0
 * Sum of the elements at column 2 is 13.0
 * Sum of the elements at column 3 is 13.0
 * 
 ***********************************************************************************************/

package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		//Code that can throw an exception
		try {
				
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Prompts user to enter 3 by 4 matrix
			System.out.println("Enter a 3-by-4 matrix row by row: ");
			
			//Two dimensional array to store matrix 
			double[][] matrix = new double[3][4];
			
			//User input into array
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}
			}
			//Scanner closed
			input.close();
			
			//Calls a method and prints return result column by column
			for (int i = 0; i < 4; i++) {
				System.out.println("Sum of the elements at column " + i + " is: " + sumColumn(matrix, i));
			}
			
			//Catches exception if it occurs and prints message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter decimal numbers.");
		}
	}
	//Sums column of a matrix row by row
	public static double sumColumn(double[][] m, int columnIndex) {
		
		//Stores sum of the column
		double sumColumn = 0;
		
		//Sums all elements of a specified column
		for (int i = 0; i < m.length; i++) {
			sumColumn += m[i][columnIndex];
		}
		//Returns the sum of column numbers
		return sumColumn;
	}
}
