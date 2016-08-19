
/**************************************************************************************************************
 * (Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix. 
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.
 * 
 **************************************************************************************************************/

package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		//Code in which exception can occur
		try {
			
			//Scanner for user input
			Scanner input = new Scanner(System.in);
			
			//Prompts user to enter the first matrix
			System.out.println("Enter matrix1: ");
			
			//2-D arrays that hold matrices 
			double[][] matrix1 = new double[3][3];
			double[][] matrix2 = new double[3][3];
			
			//User input and adding of numbers to first matrix array
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					matrix1[i][j] = input.nextDouble();
				}
			}
			//Prompts user to enter second matrix
			System.out.println("Enter matrix2: ");
			
			//User input and adding of numbers to second matrix array
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					matrix2[i][j] = input.nextDouble();
				}
			}
			//Scanner closed
			input.close();
			
			//Header for matrices
			System.out.println("The matrices: \n");
			
			//Prints first matrix row by row
			for (int i = 0; i < addMatrix(matrix1, matrix2).length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					System.out.print(matrix1[i][j] + " ");
					
					//If index reached end of the second row and last column print (+) sign
					if (i == 1 && j == 2) {
						System.out.print("  +  ");
						
						//Else print empty space
					} else if (i == 0 && j == 2 || i == 2 && j == 2) {
						System.out.print("     ");
					}
				}
				
				//Prints second matrix row by row
				for (int j = 0; j < matrix2[i].length; j++) {
					System.out.print(matrix2[i][j] + " ");
					
					//If index reached end of the second row and last column print (=) sign
					if (i == 1 && j == 2) {
						System.out.print("  =  ");
						
						//else print empty space
					} else if (i == 0 && j == 2 || i == 2 && j == 2) {
						System.out.print("     ");
					}
				}
				//Prints result of added matices by calling a method
				for (int j = 0; j < addMatrix(matrix1, matrix2)[i].length; j++) {
					System.out.print(addMatrix(matrix1, matrix2)[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only decimal numbers.");
		}
	}
	//Adds two matrices and returns sum of all numbers as a matrix
	public static double[][] addMatrix(double[][] a, double[][] b) {
			
		//2-D array to store sum of matrices
		double[][] c = new double[a.length][b[0].length];
		
		//Stores result of two matrices sum
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;//returns matrix with result
	}

}
