
/***************************************************************************************
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 * 
 ***************************************************************************************/

package zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak_1_ConvexPolygon {

	public static void main(String[] args) {
		// Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Code that can throw an exception
		try {

			// Prompts user to enter number of points
			System.out.println("Enter the number of the points: ");

			// 2-D array for storing coordinates of the points
			int[][] coordinates = new int[input.nextInt()][2];

			// Prompts user to enter coordinates for points
			System.out.println("Enter the coordinates of the point: ");

			// Stores user input into an array
			for (int i = 0; i < coordinates.length; i++) {
				for (int j = 0; j < coordinates[i].length; j++) {
					coordinates[i][j] = input.nextInt();
				}
			}

			input.close(); // Scanner closed

			// Prints a result of area of convex polygon
			System.out.println("The total area is: " + areaOfConvexPolygon(coordinates));

			// Catches an exception, prints a message and returns to the main
			// method
		} catch (Exception e) {
			System.out.println("Wrong input. Enter integer for coordinates and points. ");
			main(args);
		}

	}

	// Returns the area of the convex polygon as a double value
	public static double areaOfConvexPolygon(int[][] m) {

		// Variable to store the area
		double area = 0;
		
		// calculates area of convex polygon using the formula
		// area = ( x1 y2 - y1 x2 ) + ( x2 y3 − y2 x3 ) ..... + ( xn y1 − yn x1 ) / 2
		for (int i = 0; i < m.length - 1; i++) {
			area += (m[i][0] * m[i + 1][1]) - (m[i][1] * m[i + 1][0]);
		}
		area += (m[m.length - 1][0] * m[0][1]) - (m[m.length - 1][1] * m[0][0]);

		//returns area as positive decimal number divided by 2
		return Math.abs(area / 2);
	}
}
