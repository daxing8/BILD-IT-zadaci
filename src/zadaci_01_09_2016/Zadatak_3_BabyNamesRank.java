package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_3_BabyNamesRank {

	public static void main(String[] args) {
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter year gender and name
		System.out.print("Enter year: ");
		String year = input.next();

		System.out.print("Enter gender (M or F): ");
		String gender = input.next();

		System.out.print("Enter name: ");
		String name = input.next();
		input.close();
		
		//Creates a File class object
		File file = new File("babynameranking" + year + ".txt");
		//if the file doesn't exist end program and print message
		if (!file.exists()) {
			System.out.println("No record for " + year);
			System.exit(1);
		}
		
		//Stores rank of baby name
		int rank = 0;
		
		//Code that can throw and exception
		try {
			//Scanner for reading file
			Scanner content = new Scanner(file);
			
			//While ther is content in file add content to variables
			while (content.hasNext()) {
				String rankNum = content.next();
				String maleName = content.next();
				String nameNumber1 = content.next();
				String femaleName = content.next();
				String nameNumber2 = content.next();
				
				//if gender is male or female and name is male or female name add baby name rank to variable rank
				if (gender.equals("M") && name.equals(maleName)) {
					rank = Integer.parseInt(rankNum);
				} else if (gender.equals("F") && name.equals(femaleName)) {
					rank = Integer.parseInt(rankNum);
				}
			}
			//Scanner closed
			content.close();
			//Catches an exception and prints stack trace
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//If rank is equal to 0 name is not ranked
		if (rank == 0) {
			System.out.println("The name " + name + " is not ranked in year " + year);
		} else {
			System.out.println(name + " is ranked #" + rank + " in year " + year);
		}
	}
}
