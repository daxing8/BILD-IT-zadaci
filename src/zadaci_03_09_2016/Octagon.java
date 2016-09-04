package zadaci_03_09_2016;

public class Octagon extends GeometricObject implements Cloneable{
	
	private double side;
	
	//Default constructor
	public Octagon() {
	}

	//Constructor creates Octagon object with specified side
	public Octagon(double side) {
		this.side = side;
	}

	/*********************** Getter and Setter methods *****************************/
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	/*********************** End of Getter and Setter methods *****************************/
	
	//Returns the area of octagon
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	//Returns the perimeter of octagon
	public double getPerimeter() {
		return 8 * side;
	}

	//Compares two octagon objects and returns if they are equal greater or less then one another
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	//Overrides the clone method from Object class
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	//Returns a string representation of a octagon object
	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}

}
