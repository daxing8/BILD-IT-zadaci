package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_4_ShuffleList {

	public static void main(String[] args) {
		//Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//ArrayList of type Number
		ArrayList<Number> list = new ArrayList<>();
		
		//Prompts user to enter 10 numbers
		System.out.println("Enter ten numbers: ");
		//Counts numbers input
		int counter = 0;
		//While number count is not 10 add numbers to list
		while(counter != 10){
			list.add(input.nextInt());
			counter++;
		}
		//Scanner closed
		input.close();
		//Calls a method to shuffle the list
		shuffle(list);
	}
	//Shuffles numbers in a list and prints them to console
	public static void shuffle(ArrayList<Number> list){
		//Shuffles the list
		Collections.shuffle(list);
		//Prints the list calling toString method
		System.out.println("Your numbers shuffled: " + list.toString());
	}
}
