package zadaci_26_08_2016;

public class Triangle extends GeometricObject{
	
	//private data fields holding sides of a triangle
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
		
	//Default constructor
	public Triangle() {
		
	}
	// Constructor that creates a triangle with specified side values
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/****************** Getter methods **********************/
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	/****************** End of Getter methods **********************/
	
	//Returns perimeter of 3 triangle sides
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	//Returns area of a triangle
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
	}
	//String representation of a triange object sides
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 " + side2 + " side3 " + side3;
	}
}
