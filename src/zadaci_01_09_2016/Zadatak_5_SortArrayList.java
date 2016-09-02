package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_5_SortArrayList {

	public static void main(String[] args) {
		// Scanner for user input
		Scanner input = new Scanner(System.in);

		// ArrayList of type Number
		ArrayList<Number> list = new ArrayList<>();

		// Prompts user to enter 10 numbers
		System.out.println("Enter ten numbers: ");
		// Counts numbers input
		int counter = 0;
		// While number count is not 10 add numbers to list
		while (counter != 10) {
			list.add(input.nextInt());
			counter++;
		}
		// Scanner closed
		input.close();
		// Calls a method to sort the list
		sort(list);
	}

	// Sorts numbers in a list and prints them to console
	public static void sort(ArrayList<Number> list) {
		//ArrayList to transfer elements from list so they can be sorted 
		ArrayList<Integer> temp = new ArrayList<>();
		//Casts numbers from type Number to type Integer and adds them to temp ArrayList
		for (int i = 0; i < list.size(); i++) {
			temp.add(list.get(i).intValue());
		}
		// Sorts the list
		Collections.sort(temp);

		// Prints the list calling toString method
		System.out.println("Your numbers sorted: " + temp.toString());
	}

}
