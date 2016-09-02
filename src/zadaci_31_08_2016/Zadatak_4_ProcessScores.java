package zadaci_31_08_2016;

import java.util.Scanner;

public class Zadatak_4_ProcessScores {

	public static void main(String[] args) {
		// Code that can throw an exception
		try {
			
			//Counter and sum
			int scoreCount = 0;
			int sum = 0;
			
			// New URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			// Scanner object to read content from file
			Scanner input = new Scanner(url.openStream());
			// Reads the input from the URL source to variable scores
			while (input.hasNext()) {
				int scores = input.nextInt();
				//Sums all score numbers
				sum += scores;
				// Counts score numbers
				scoreCount++;
				// Prints the numbers from a URL stored in variable 
				System.out.print(scores + " ");

				if (scoreCount % 10 == 0) {
					System.out.println();
				}
			}
			// Prints score total and average
			System.out.println("\n\nScores total: " + sum);
			System.out.println("Scores average: " + sum / scoreCount);
			input.close();
			
			// Catches an exceptions
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: file doesn't exist.");
		}
	}
}
