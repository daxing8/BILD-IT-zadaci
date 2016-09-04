
/***********************************************************************************
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their radii
 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
 * and Comparable.
 ***********************************************************************************/

package zadaci_03_09_2016;

public class Zadatak_1_EnableCircleComparable {

	public static void main(String[] args) {
		
		//Creates two Circle objects to be compared
		Circle c1 = new Circle(8);
        Circle c2 = new Circle(8);
        
        //Prints boolean value if two objects are equal or not
        System.out.println("Two Circle objects are equal: " + c1.equals(c2));
	}

}
