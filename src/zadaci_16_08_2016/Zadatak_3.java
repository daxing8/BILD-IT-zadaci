package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Scaner for user input

		System.out.println("Enter a SSN: "); // Propts user to enter a SSN

		String ssn = input.nextLine(); // User input of SSN as a string

		while (!checkSSN(ssn)) {	//While SSN is not valid prompt user to enter a valid SSN
			
			System.out.println(ssn + " is an invalid Social Security Number. \nEnter valid SSN: ");
			ssn = input.nextLine();
		}
		System.out.println(ssn + " is a valid Social Security Number"); //Outputs that SSN is valid

		input.close();			//Scanner closed
	}
	
	public static boolean checkSSN(String str) {		//Checks SSN for validity returns true if it is valid and false if it is not

		int counter = 0;			//Counts number of digits in a string
		
		//If length of a string is not 11 or other parameters of SSN are not corect returns false 
		if (str.length() != 11 || str.charAt(3) != '-' && str.charAt(6) != '-') {
			return false;
		}
		
		//If character in a string is a digit counter is incremented
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				counter++;
			}
		}
		if (counter != 9) {		//When string doesn't have 9 digits it is not valid SSN
			return false;
		}
		return true;		//If all checks are passed the number is valid SSN returns true

	}
}
