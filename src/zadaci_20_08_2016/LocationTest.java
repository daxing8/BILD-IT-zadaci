package zadaci_20_08_2016;

import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {

		// Code that can throw an exception
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Location object for locating largest element
			Location loc = new Location();

			// Prompts user to enter number of rows and columns for his array
			System.out.println("Enter the number of rows and columns in the array: ");

			// Stores how many rows and columns does user want in array
			int rows = input.nextInt();
			int columns = input.nextInt();

			// 2-D array to store the elements
			double[][] m = new double[rows][columns];

			// Prints header for user input
			System.out.println("Enter the array: ");

			// Adds user input elements in the matrix
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextDouble();
				}
			}
			System.out.println();

			// Prints matrix for user check of the result
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}

			input.close(); // Scanner closed

			// Calls a method to locate largest element
			loc = Location.locateLargest(m);

			// Prints max value and location of it in the array
			System.out.println("\nThe location of the largest element " + loc.maxValue + " is: (" + loc.row + ","
					+ loc.column + ")");

		} catch (Exception e) {
			System.out.println("Wrong input. Enter correct type of data.");
		}
	}
}
