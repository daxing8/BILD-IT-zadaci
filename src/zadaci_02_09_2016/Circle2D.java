package zadaci_02_09_2016;

public class Circle2D extends GeometricObject {
	//Private data fields
	private double x = 0;
	private double y = 0;
	private double radius = 0;
	final static double PI = 3.1415;
	
	//Default Constructor
	Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	//Constructor creates a Circle2D object with specified values
	Circle2D(double newX, double newY, double newRadius){
		this.x = newX;
		this.y = newY;
		this.radius = newRadius;
	}

	/*********************** Getter methods *****************************/
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	/********************* End of Getter methods *************************/
	
	//Returns area of circle
	public double getArea(){
		
		double area = PI * this.radius * this.radius; 
		
		return area;
	}
	//Returns perimeter of a circle
	public double getPerimeter(){
		
		double perimeter = 2 * PI * this.radius;
		
		return perimeter;
	}
	//Checks if specified point is inside this circle
	public boolean contains(double x, double y){
		
		boolean contains = false;
		double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		if(this.radius >= distance){
			contains = true;
		}
		return contains;
	}
	//Checks if specified circle is inside this circle
	public boolean contains(Circle2D circle){
		boolean contains = false;
		double distance = Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2));
		if(this.radius >= distance + circle.radius){
			contains = true;
		}
		
		return contains;
	}
	//Checks if specified circle overlaps with this circle
	public boolean overlaps(Circle2D circle){
		boolean overlaps = false;
		double distance = Math.sqrt(Math.pow((this.x - circle.getX()), 2) + Math.pow((this.y - circle.getY()), 2));
		if(distance < this.radius + circle.radius){
			overlaps = true;
		}
		return overlaps;
	}
}
