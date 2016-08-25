
/********************************************************************************
 * (The MyPoint class) Design a class named MyPoint to represent a point with
 * x- and y-coordinates. The class contains:
 * - The data fields x and y that represent the coordinates with getter methods.
 * - A no-arg constructor that creates a point (0, 0).
 * - A constructor that constructs a point with specified coordinates.
 * - A method named distance that returns the distance from this point to a
 * specified point of the MyPoint type.
 * - A method named distance that returns the distance from this point to
 * another point with specified x- and y-coordinates.
 * Draw the UML diagram for the class and then implement the class. Write a
 * test program that creates the two points (0, 0) and (10, 30.5) and displays the
 * distance between them.
 ************************************************************************************/



package zadaci_23_08_2016;

public class MyPoint {
	private double x;
	private double y;

	

	//Default constructor
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	//Constructor with specified coordinates
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/******************** Getters ***********************/
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	/***************** End of Getters ***********************/
	
	//Checks distance to a specified point
	public double distance(MyPoint p) {
		return this.distance(p.getX(), p.getY());
	}

	// Checks distance to another point with specified x- and y-coordinates
	public double distance(double x2, double y2) {
		return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
	}

}
