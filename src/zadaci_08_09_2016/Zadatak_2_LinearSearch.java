
/*************************************************************************************
 * (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 *************************************************************************************/

package zadaci_08_09_2016;

public class Zadatak_2_LinearSearch {

	public static void main(String[] args) {
		//Array of integers
		Integer[] list = {2, 5, 7, 4, 9, 8, 10};
		
		int key = 11;
		//Checks if a number returned is -1 number is not in the list
		if(linearSearch(list, key) == -1){
			System.out.println("Number is not in the list");
		}else{
			//else print the index of a number
			System.out.println("Number is located at index: " + linearSearch(list, key));
		}
	}
	//Retunrs index of a number in array
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		//Searches the array for a number
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(key)){
				return i;
			}
		}//Returns -1 if number is not in the list
		return -1;
	}
}
