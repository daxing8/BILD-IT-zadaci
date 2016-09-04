package zadaci_02_09_2016;

public class Rectangle extends GeometricObject{
	
	//Data fields
	private double width;
	private double height;
	
	//Default constructor
	public Rectangle() {
	}
	//Constructor that creates object with new specified values
	public Rectangle(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	}
	//Constructor that sets data fields from GeometricObject class
	public Rectangle(double Width, double Height, String Color, boolean Filled) {
		this.width = Width;
		this.height = Height;
		setColor(Color);
		setFilled(Filled);
	}
	
	/********************** Getter and Setter methods *****************************/
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double Height) {
		this.height = Height;
	}
	
	/******************* End of Getter and Setter methods **************************/
	
	//Method returns area of the rectangle
	public double getArea() {
		return width * height;
	}
	//Method returns perimeter of rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return "Rectangle object height: " + this.height
				+ " and width: " + this.width;
	}
}
