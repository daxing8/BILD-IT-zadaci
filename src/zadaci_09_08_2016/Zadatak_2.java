package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {

		//If an exception occurs in the try block it is send to catch block to be handled
		try {
			
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Prints message for users input
			System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
			
			//User input latitude
			double x1 = input.nextDouble();
			
			//User input longitude
			double y1 = input.nextDouble();
			
			//Prints message for users input
			System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
			
			//User input latitude
			double x2 = input.nextDouble();
			
			//User input longitude
			double y2 = input.nextDouble();
			
			//Scanner object closed
			input.close();
			
			//Method call to calculate great circle distance
			calculateGreatCircleDistance(x1, x2, y1, y2);
			
			//Catches an exception, stops the program from executing further and sends a message
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! Enter only decimal numbers.");
		}
		
	}
	
	//Method receives four double values as arguments and calculates great circle distance
	public static void calculateGreatCircleDistance(double x1, double x2, double y1, double y2){
		
		//Earth radius in kilometers 
		double radius = 6371.01;
		
		//Formula for calculating distance between two points using their degrees in latitude and longitude
		//degrees in latitude and longitude are converted into radians using Math.toRadians() method
		double distance = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))
		* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
		
		//Prints the distance between two points in kilometers
		System.out.println("The distance between two points is: " + distance + " km");
	}
}
