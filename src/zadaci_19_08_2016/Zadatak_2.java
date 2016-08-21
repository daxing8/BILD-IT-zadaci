
/********************************************************************************************
 * 
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. 
 * The header of the method is:
 * 
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * 
 ********************************************************************************************/




package zadaci_19_08_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_2 {
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
			
			DecimalFormat format = new DecimalFormat("#0.0");

			//Prints first matrix row by row
			for (int i = 0; i < multiplyMatrix(matrix1, matrix2).length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					System.out.print(matrix1[i][j] + " ");
					
					//If index reached end of the second row and last column print (+) sign
					if (i == 1 && j == 2) {
						System.out.print("  *  ");
						
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
				for (int j = 0; j < multiplyMatrix(matrix1, matrix2)[i].length; j++) {
					System.out.print(format.format(multiplyMatrix(matrix1, matrix2)[i][j]) + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only decimal numbers.");
		}
	}
	//Adds two matrices and returns sum of all numbers as a matrix
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
			
		//2-D array to store sum of matrices
		double[][] c = new double[a.length][b[0].length];
		
		//Stores result of two matrices sum
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = (a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]);
			}
		}
		return c;//returns matrix with result
	}

}
