
/******************************************************************************
 * (Maximum element in a two-dimensional array) Write a generic method that
 * returns the maximum element in a two-dimensional array.
 * public static <E extends Comparable<E>> E max(E[][] list)
 ******************************************************************************/

package zadaci_08_09_2016;

public class Zadatak_4_MaxElement2D {

	public static void main(String[] args) {
		// Array of integers
		Integer[][] list = new Integer[5][5];
		//Adds random numbers to the array
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = (int)(Math.random() * 10);
			}
		}
		//Prints the array
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
				}
			System.out.println();
		}
		// Calls a method and prints the max element
		System.out.println("\nMax number in the list is: " + max(list));
	}

	// Returns max generic element in array
	public static <E extends Comparable<E>> E max(E[][] list) {
		// Stores first element of the array
		E max = list[0][0];
		// Checks if every other element in the array is larger than first
		// element
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				
				// If it is larger store it to max
				if (list[i][j].compareTo(max) > 0) {
					max = list[i][j];
			}
			}
		} // return max
		return max;
	}

}
