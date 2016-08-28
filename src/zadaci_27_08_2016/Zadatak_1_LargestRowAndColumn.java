
/******************************************************************************************
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * the most 1s.) Here is a sample run of the program:
 * Enter ten integers: 34 5 3 5 6 4 33 2 2 4
 * The distinct integers are 34 5 3 6 4 33 2
 * 
 * Enter the array size n: 4
 * The random array is
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2, 3
 * 
 ********************************************************************************************/


package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_LargestRowAndColumn {

	public static void main(String[] args) {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Two ArrayLists to hold row and column indices
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();
		
		//Code that can throw an exception
		try {
			
			//Prompts user to enter an array size
			System.out.println("Enter the array size n: ");
			//User input
			int n = input.nextInt();	
			
			//Creates new 2-D array
			int[][] array = new int[n][n];
			
			//Calls a method to fill the array with 0s and 1s
			fill(array);
			
			//Adds largest row and column index to the lists
			row.add(getLargestRow(array));
			column.add(getLargestColumn(array));
			
			//Prints the matrix
			printMatrix(array);
			
			//Prints largest row and column index
			System.out.println("\nLargest row index: " + row.get(0));
			System.out.println("Largest column index: " + column.get(0));
			
			//Scanner closed
			input.close();
			
			//Catches an exception and prints the message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter valid value type.");
			main(args);
		}

	}
	//Returns the largest row index
	public static int getLargestRow(int[][] m) {
		
		//Array to store count of 1s in rows
		int[] rows = new int[m.length];
		
		//Stores number of ones for every row in the array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					rows[i]++;
				}
			}
		}
		//Returns a method call to find the max row index
		return findMax(rows);
	}
	//Returns the largest column index
	public static int getLargestColumn(int[][] m) {
		
		//Array to store count of 1s in columns
		int[] columns = new int[m.length];
		
		//Stores number of ones for every column in the array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					columns[j]++;
				}
			}
		}
		//Returns a method call to find the max column index
		return findMax(columns);
	}
	//Fills the array with random 0 and 1 numbers
	public static void fill(int[][] m) {
		
		//Adds random 0s and 1s to the array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
	}
	//Prints the array matrix of random numbers 
	public static void printMatrix(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	//Finds max index of largest array row or column
	public static int findMax(int[] m) {
		
		//Variables to store max number and index of max number
		int max = 0;
		int index = 0;
		
		//Finds max index in an array
		for (int i = 0; i < m.length; i++) {
			if (m[i] > max) {
				max = m[i];
				index = i;
			}
		}
		return index;
	}
}
