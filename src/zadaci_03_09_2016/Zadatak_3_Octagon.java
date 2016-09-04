
/**************************************************************************************
 * (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * 
 * area = (2 + 4/22)* side * side
 * 
 * Draw the UML diagram that involves Octagon, GeometricObject,
 * Comparable, and Cloneable. Write a test program that creates an Octagon
 * object with side value 5 and displays its area and perimeter. Create a new object
 * using the clone method and compare the two objects using the compareTo
 * method.
 **************************************************************************************/

package zadaci_03_09_2016;

public class Zadatak_3_Octagon {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		//Creates instance of Octagon object to be compared
		Octagon oct1 = new Octagon(11);
		
		//Clones first Octagon object by calling a method
		Octagon oct2 = (Octagon)oct1.clone();
		
		//Prints a result depending on return value
		if(oct1.compareTo(oct2) == 0){
			System.out.println("Two Octagon objects are equal.");
		}else if(oct1.compareTo(oct2) == 1){
			System.out.println("Octagon object oct1 is greater than oct2");
		}else{
			System.out.println("Octagon object oct1 is less than oct2");
		}
	}

}
