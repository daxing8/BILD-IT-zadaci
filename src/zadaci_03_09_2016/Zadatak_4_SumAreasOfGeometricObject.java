
/**************************************************************************************
 * (Sum the areas of geometric objects) Write a method that sums the areas of all the
 * geometric objects in an array. The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 **************************************************************************************/

package zadaci_03_09_2016;

public class Zadatak_4_SumAreasOfGeometricObject {
	public static void main(String[] args) {
		
		//Creates an array of GeometricObjects with diferent value
		GeometricObject[] objectsArray = { new Circle(7), new Circle(10), new Rectangle(2, 5), new Rectangle(3, 4) };
		
		//Prints the result 
		System.out.printf("Area of every object in array summed: %.2f", sumArea(objectsArray));
	}
	
	//Sums the area of every object in the array
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
}
