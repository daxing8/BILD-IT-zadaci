package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_3_OccurrenceOfLetter {

	public static void main(String[] args) {
		//Scanner for file name input
		Scanner fileInput = new Scanner(System.in);
		
		//Prompts user to enter a file name
		System.out.print("Enter file name: ");
		String filename = fileInput.next();
		
		//Creates a file instance with user file name
		File file = new File(filename);
		
		//If the file doesn't exist end the program
		if (!file.exists()) {
			System.out.println(file + " doesn't exist");
			System.exit(1);
		}
		//Scanner closed
		fileInput.close();
		
		//String to store letters
		String letters = "";
		
		//Array of type int to count letters 
		int[] letterCount = new int[26];
		
		//Code that can throw an exception
		try {
			
			//Scanner for reading file content
			Scanner input = new Scanner(file);
			
			//Reading file content to variable letters
			while (input.hasNext()) {
				letters = input.nextLine();
				
				//Adds character by character and checks if they are a letter
				//If they are it increments the counter at specified index in array
				for (char ch : letters.toCharArray()) {
					ch = Character.toUpperCase(ch);
					if (ch >= 'A' && ch <= 'Z') {
						letterCount[ch - 'A']++;
					}
				}
			}
			//Scanner closed
			input.close();
			//Catches an exception and prints stack trace
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Prints result to console
		for (int i = 0; i < letterCount.length; i++) {
			System.out.println("Number of " + (char) (i + 'A') + "'s = " + letterCount[i]);
		}
	}
}
