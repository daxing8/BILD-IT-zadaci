
/**********************************************************************************
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 **********************************************************************************/


package zadaci_31_08_2016;

import java.util.Scanner;

public class Zadatak_3_CountWords {

	public static void main(String[] args) {
		//Code that can throw an exception
		try {
			int wordCount = 0;
			
			// New URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			// Scanner object to read content from file
			Scanner input = new Scanner(url.openStream());
			//Reads the input from the URL source to string
			while (input.hasNext()) {
				String line = input.next();
				// Counts words
				wordCount++;
				// Prints the words from a string
				System.out.print(line + " ");
				
				if(wordCount % 10 == 0){
					System.out.println();
				}
			}
			// Prints word count in file
			System.out.println("\n\nThe file has " + wordCount + " words");
			input.close();
			//Catches an exceptions
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: file doesn't exist.");
		}
	}

}
