package zadaci_22_08_2016;

import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		
		//Coda that can throw an exception
		try {
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			// Prompts user to enter values for calculating the equations
			System.out.println("Enter a value for a, b and c: ");
			
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			// Creating QuadraticEquation object for calculation
			QuadraticEquation test = new QuadraticEquation(a, b, c);

			// When conditions are met the masage is printed
			if (test.getDiscriminant() > 0) {
				System.out.printf("Root 1: %4.2f \nRoot2: %4.2f ", test.getRoot1(), test.getRoot2());
			} else if (test.getDiscriminant() == 0) {
				System.out.printf("Root 1: %4.2f", test.getRoot1());
			} else {
				System.out.println("The equation has no roots.");
			}
			input.close();
			//If exception occurs catch it and display a message
		} catch (Exception e) {
			System.out.println("Exception occured. Please enter only decimal values.");
		}

	}

}
