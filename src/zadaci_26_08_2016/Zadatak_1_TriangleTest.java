
/******************************************************************************************
 * (The Triangle class) Design a class named Triangle that extends
 * GeometricObject. The class contains:
 * ■ Three double data fields named side1, side2, and side3 with default
 * values 1.0 to denote three sides of the triangle.
 * ■ A no-arg constructor that creates a default triangle.
 * ■ A constructor that creates a triangle with the specified side1, side2, and
 * side3.
 * ■ The accessor methods for all three data fields.
 * ■ A method named getArea() that returns the area of this triangle.
 * ■ A method named getPerimeter() that returns the perimeter of this triangle.
 * ■ A method named toString() that returns a string description for the triangle.
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 * The toString() method is implemented as follows:
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 * " side3 = " + side3;
 * 
 * Draw the UML diagrams for the classes Triangle and GeometricObject and
 * implement the classes. Write a test program that prompts the user to enter three
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle
 * is filled. The program should create a Triangle object with these sides and set
 * the color and filled properties using the input. The program should display
 * the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * 
 *************************************************************************************************/


package zadaci_26_08_2016;

import java.util.Scanner;

public class Zadatak_1_TriangleTest {

	public static void main(String[] args) {
			
		//Code that can throw an exception
		try {
			
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			//Prompts user to enter three sides of a triangle
			System.out.println("Enter three sides of a triangle in decimal value: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
			//Prompts user to enter a colour of triangle
			System.out.println("Enter a colour of a triangle: ");
			String triangleColor = input.next();
			//Prompts user to enter if triangle is filled (true or false)
			System.out.println("Enter true or false if triangle is filled: ");
			boolean filledValue = input.nextBoolean();
			
			//Creates Triangle object with 3 sides
			Triangle tr = new Triangle(side1, side2, side3);
			
			//Sets color and filled to user input value
			tr.setFilled(filledValue);
			tr.setColor(triangleColor);
			//Scanner closed
			input.close();
			//Prints triangle methods and string representation of a triangle
			System.out.println("\n" + tr.toString());
			System.out.println("Area of the triangle is: " + tr.getArea());
			System.out.println("Perimeter of the triangle is: " + tr.getPerimeter());
			System.out.println("Colour of the triangle is: " + tr.getColor());
			System.out.println("Triangle is " + (tr.getFilled() ? "filled." : "not filled."));
			System.out.println("\nTriangle object created: " + tr.getDate());
			
			//Catches an exception if it occurrs and prints a message
		} catch (Exception e) {
			System.out.println("Exception occured. Input only valid data type.");
			main(args);
		}
	}

}
