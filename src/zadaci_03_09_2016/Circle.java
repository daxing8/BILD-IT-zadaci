package zadaci_03_09_2016;

public class Circle extends GeometricObject {
	//Data field
	private double radius;
	
	//Default constructor
	public Circle() {
    }
	//Constructor creates Circle object with specified radius
    public Circle(double radius) {
        this.radius = radius;
    }
    //Constructor creates Circle object with specified values
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

	
	/*********************** Getter and Setter methods *****************************/
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/********************* End of Getter and Setter methods *************************/
	
	//Returns area of a circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	//Returns diameter of circle
	public double getDiameter() {
        return 2 * radius;
    }

    //Returns perimeter of a circle
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    //Overrided equals method checks if two objects a re equal and returns boolean value
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }

    //Prints Circle date created and radius
    public void printCircle() {
        System.out.println("The circle is created " + getDate() +
                " and the radius is " + radius);
    }

}
