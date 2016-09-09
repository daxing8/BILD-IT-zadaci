
/*****************************************************************************************
 * (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * 
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 *****************************************************************************************/

package zadaci_08_09_2016;

import java.util.ArrayList;

public class Zadatak_1_DistinctElements {

	public static void main(String[] args) {
		
		//ArrayList for storing integers
		ArrayList<Integer> list = new ArrayList<>();
		
		//Adds integers to list
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(3);
		
		//Prints a list of numbers
		System.out.println("List of random numbers: ");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		//Calls a method to remove duplicate numbers from list and prints them
		System.out.println("\nList with removed duplicate numbers: ");
		for (Integer integer : removeDuplicates(list)) {
			System.out.print(integer + " ");
		}

	}
	//Generic method returns generic type list with removed duplicate numbers
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		
		//List for storing removed duplicate numbers
		ArrayList<E> list1 = new ArrayList<>();
		//If the number is not already in the list1 add it to the list
		for (int i = 0; i < list.size(); i++) {
			if (!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}
		}	//Returns the list with removed duplicate numbers
		return list1;
	}
}
