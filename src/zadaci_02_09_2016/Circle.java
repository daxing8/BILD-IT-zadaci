package zadaci_02_09_2016;

public class Circle extends GeometricObject{
	//Data field
	private double radius;
	static int numberOfObjects;
	
	//Default constructor
	Circle() {
		radius = 1;
		numberOfObjects++;

	}
	//Constructor creates Circle object with specified radius
	Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	/*********************** Getter and Setter methods *****************************/
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (newRadius >= 0) {
			radius = newRadius;
		}
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	/********************* End of Getter and Setter methods *************************/
	
	//String representation of a circle radius
	@Override
	public String toString() {
		return "Circle radius: " + radius;
	}

}
