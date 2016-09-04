
/**********************************************************************************
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal
 * if their areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable.
 **********************************************************************************/

package zadaci_03_09_2016;

public class Zadatak_2_EnableRectangleComparable {

	public static void main(String[] args) {
		
		//Two Rectangle objects for comparing 
		Rectangle r1 = new Rectangle(7, 5);
		Rectangle r2 = new Rectangle(7, 5);
		
		//Prints boolean value if two objects are equal or not
		System.out.println("Two Rectangle objects are equal: " + r1.equals(r2));
	}

}
