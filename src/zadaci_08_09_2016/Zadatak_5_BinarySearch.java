
/********************************************************************************
 * (Generic binary search) Implement the following method using binary search.
 * public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 ********************************************************************************/

package zadaci_08_09_2016;

public class Zadatak_5_BinarySearch {

	public static void main(String[] args) {
		// Array of integers
		Integer[] list = {2, 5, 7, 9, 10, 12, 13};
		
		//If returned value equals -1 the element is not in the array
		if(binarySearch(list, 10) == -1){
			System.out.println("Number is not in the list");
		}else{
			//else print the index of a number
			System.out.println("Number is located at index: " + binarySearch(list, 10));
		}
	}
	//Method receives generic type arguments and returns index of key element in array as integer
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
		 
		int start = 0;
		int end = list.length - 1;
		//Binary search algorithm that finds key element index in sorted array
		//While first index of array is smaller than or equal to end index
		while (start <= end) {
			//calculates the middle index of array
			int mid = (start + end) / 2;
			//if the key is equal to mid index return mid
			if (key.equals(list[mid])){
				return mid;
				//else if the key is smaller than mid index end of array is set to mid index
			}else if (key.compareTo(list[mid]) < 0){
				end = mid - 1;
			}else{//otherwise start of array is set to mid index
				start = mid + 1;
			}
		}
		//Return negative 1 if all checks failed
		return -1;
	}
}
