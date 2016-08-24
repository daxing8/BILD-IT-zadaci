package zadaci_22_08_2016;

import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {

		// Code that can throw an exceprion
		try {

			// Scanner object for user input
			Scanner input = new Scanner(System.in);

			// Prompts user to enter values for the equation
			System.out.println("Enter values for a, b, c, d, e, f : ");

			// New LinearEquation object with specified user input values
			LinearEquation equation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(),
					input.nextDouble(), input.nextDouble(), input.nextDouble());

			// if equation is solvable print result to the user otherwise print
			// message
			if (equation.isSolvable()) {
				System.out.printf("X is: %4.2f \tY is: %4.2f", equation.getX(), equation.getY());
			} else {
				System.out.println("Equation is not solvable.");
			}
			input.close(); // Scanner closed

			// Prints a message if exception occurs
		} catch (Exception e) {
			System.out.println("Exception occured. Please make a valid input.");
		}

	}

}
