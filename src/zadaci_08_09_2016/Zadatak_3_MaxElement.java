
/**************************************************************************************************************
 * (Maximum element in an array) Implement the following method that returns the maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 **************************************************************************************************************/

package zadaci_08_09_2016;

public class Zadatak_3_MaxElement {

	public static void main(String[] args) {
		//Array of integers
		Integer[] list = {4, 2, 3, 11, 9, 8, 5};
		//Calls a method and prints the max element
		System.out.println("Max number in the list is: " + max(list));
	}
	//Returns max generic element in array
	public static <E extends Comparable<E>> E max(E[] list){
		//Stores first element of the array
		E max = list[0];
		//Checks if every other element in the array is larger than first element
		for (int i = 0; i < list.length; i++) {
			//If it is larger store it to max
			if(list[i].compareTo(max) > 0){
				max = list[i];
			}
		}//return max
		return max;
	}

}
