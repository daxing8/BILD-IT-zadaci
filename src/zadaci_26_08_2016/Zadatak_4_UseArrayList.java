
/****************************************************************************************
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 * 
 ****************************************************************************************/


package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak_4_UseArrayList {

	public static void main(String[] args) {
		// Create an array list of objects
		ArrayList<Object> objectList = new ArrayList<Object>();
		objectList.add(new String("ArrayList of Cricle Loan and Date objects: "));
		objectList.add(new Circle(5.5));
		objectList.add(new Loan(2.1, 5, 10500));
		objectList.add(new Date());

		// Display all the elements in the list by
		// invoking the object’s toString() method
		for (int i = 0; i < objectList.size(); i++) {
			System.out.println("\n" + (objectList.get(i)).toString());
		}
	}
}
