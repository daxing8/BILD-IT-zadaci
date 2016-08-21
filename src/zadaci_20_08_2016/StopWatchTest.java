package zadaci_20_08_2016;

import java.util.Random;

public class StopWatchTest {

	public static void main(String[] args) {
		
		//Creates an StopWatch object to count the elapsed time
		StopWatch time = new StopWatch();
		
		//Creates Random object to generate random numbers 
		Random num = new Random();
		
		//Array that holds random numbers
		int[] randomNumbers = new int[100000];
		
		//Adds random numbers to the array
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = num.nextInt();
		}
		//Calls a method to start timing
		time.start();
		
		//Calls a method to sort numbers 
		sortNumbers(randomNumbers);
		
		//Method that stops the timing
		time.stop();
		
		//Prints elapsed time for sorting numbers 
		System.out.println("Elapsed time  for sorting 100.000 numbers is: " + time.getElapsedTime() + " sec");
	}
	//Sorts numbers by selection sort method
	public static void sortNumbers(int[] a){
		
		//Stores index of min number
		int minIndex = 0;
		
		//Selection sort in ascending order, finds the smallest number and replaces it with a number in first index 
		for (int i = 0; i < a.length - 1; i++) {
			minIndex = i;
			for (int j = 0; j < a.length - 1; j++) {
				
				//If a number is smaller switch places
				if(a[j] < a[minIndex]){
					minIndex = j;	//updates index of the smallest number
					
					int temp = a[minIndex];
					a[minIndex] = a[i];
					a[i] = temp;
				}
			}
		}
	}

}
