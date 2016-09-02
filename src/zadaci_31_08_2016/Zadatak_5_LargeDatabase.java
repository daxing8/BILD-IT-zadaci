
/***************************************************************************************
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 ***************************************************************************************/


package zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;

public class Zadatak_5_LargeDatabase {

	public static void main(String[] args) {
		
		File file = new File("Salary.txt");
		// Array holding rank titles
		String[] rank = { "assistant", "associate", "professor" };
		//Holding salary amount
		double salary = 0;
		
		//Code that can throw an exception
		try {
			// PrintWriter object for file input
			java.io.PrintWriter writer = new java.io.PrintWriter(file);
			for (int i = 1; i <= 1000; i++) {
				// For random ranks
				int random = (int) (Math.random() * 3);
				// Calculates random salaries in range
				if (rank[random].equals("assistant")) {
					salary = Math.round(50000 + (int)(Math.random() * 40000));
				}
				if (rank[random].equals("associate")) {
					salary = Math.round(60000 + (int)(Math.random() * 50000));
				}
				if (rank[random].equals("professor")) {
					salary = Math.round(75000 + (int)(Math.random() * 55000));
				}
				// Writes in file
				writer.println("Firstname " + i + " Lastname " + i + " " + rank[random] + " " + salary);
			}
			writer.close();
			
			//Catches an exception
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
