
/*******************************************************************************************
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 *
 *******************************************************************************************/


package zadaci_18_08_2016;

import java.util.Random;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		//Creates Random object for generating random numbers
		Random random = new Random();
		
		//Array of random integers from 0 - 9
		int[] randoms = new int[100];
		
		//Stores number of times each random number from 0-9 appears
		int[] counts = new int[10];
		
		//Generates random numbers and stores them to array
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = random.nextInt(10);
		}
		
		//Counts how many times a random number appears in an array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < randoms.length; j++) {
				if(i == randoms[j]){
					counts[i]++;
				}
			}
		}
		//Prints all numbers from 0-9 and number of times they are repeated in array
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Times number " + i + " appears in array is: " + counts[i]);
		}
	}
}
