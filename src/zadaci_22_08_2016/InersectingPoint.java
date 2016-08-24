
/*******************************************************************************************
 * (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
 * for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * equation. See Programming Exercise 3.25 for sample runs.
 *******************************************************************************************/


package zadaci_22_08_2016;

import java.util.Scanner;

public class InersectingPoint {

	public static void main(String[] args) {
		
		//Code that can throw an exception
		try {
			
			//Scanner object created for user input
			Scanner input = new Scanner(System.in);
			
			//Prompts user to enter values to be processed
			System.out.println("Enter values for x1 and y1: ");
			double x1=input.nextDouble();
			double y1=input.nextDouble();
			
			System.out.println("Enter values for x2 and y2: ");
			double x2=input.nextDouble();
			double y2=input.nextDouble();
			
			System.out.println("Enter values for x3 and y3: ");
			double x3=input.nextDouble();
			double y3=input.nextDouble();
			
			System.out.println("Enter values for x4 and y4: ");
			double x4=input.nextDouble();
			double y4=input.nextDouble();
			
			//Creating LinearEquation object to calculate intersecting points
			LinearEquation intersecting  = new LinearEquation((y1 - y2), (x1 - x2), (y3 - y4), (x3 - x4),
						((y1 - y2) * x1 - (x1 - x2) * y1), ((y3 - y4) * x3 - (x3 - x4) * y3));

			//if it is solvable print x and y coordinates 
			if(intersecting.isSolvable()){
				System.out.printf("Intersection coordinates for x: %4.4f \ty: %4.4f ", intersecting.getX(), intersecting.getY());
			}else{
				System.out.println("Lines are parallel.");	//otherwise lines are parallel
			}
			input.close();
			
			//Prints a message if exception occurrs
		} catch (Exception e) {
		System.out.println("Exception occurred. Please enter a valid input values.");
		}
	
	}

}
