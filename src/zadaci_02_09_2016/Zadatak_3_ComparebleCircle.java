package zadaci_02_09_2016;

public class Zadatak_3_ComparebleCircle {

	public static void main(String[] args) {
		//Creates two ComarableCircle objects to be compared
		ComparableCircle c1 = new ComparableCircle(0, 0, 5);
		ComparableCircle c2 = new ComparableCircle(0, 0, 10);
		
		//ComparableCircle object cals GeometicObject method max to calculate max object
		ComparableCircle c3 = (ComparableCircle) GeometricObject.max(c1, c2);
		
		//Prints max circle object
		System.out.println("Max circle is: " + c3.getRadius());
	}
}
//ComparebleCircle class extends Circle2D
class ComparableCircle extends Circle2D{ 
	//Default constructor
	ComparableCircle() {
	}
	//Constructor with specified values
	ComparableCircle(double x, double y, double radius) {
		super(x, y, radius);
	}
}
