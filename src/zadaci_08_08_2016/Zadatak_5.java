
/***********************************************************************************
 * 
 * Neke web stranice forsiraju odreðena pravila za passworde. 
 * Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa: 
 * 
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * 
 * Napisati program koji pita korisnika da unese password te mu ispisuje 
 * "password je validan" ukoliko su sva pravila ispoštovana ili 
 * "password nije validan" ukoliko pravila nisu ispoštovana.
 * 
 ************************************************************************************/



package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	
	//Method receives one String as an argument and checks if password is valid or not
	public static boolean checkPassword(String n) {
		
		//Sets password to false
		boolean password = false;
		
		//Counts the digits in the password/ there has to be minimum of 2 digits
		int counter = 0;
		
		//Checks password for all parameters required
		for (int i = 0; i < n.length(); i++) {
			
			//If the character is digit counter increments by one
			if (Character.isDigit(n.charAt(i))) {
				counter++;
			}
			//If character is letter or a digit or it's length is equal to or more that 8 then the password is valid
			if (Character.isLetterOrDigit(n.charAt(i)) && n.length() >= 8) {
				password = true;//sets password to true
			}
			//If there is less then 2 digits then the password is not valid
			if (counter < 2) {
				password = false;//sets password to false
			}
		}
		//returns boolean true if it is valid or false if it is not
		return password;

	}

	public static void main(String[] args) {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Enter your password message output on the console
		System.out.print("Enter password: ");
		
		//user input type String
		String n = input.next();
		
		//Scanner object closed
		input.close();
		
		//Console output of a confirmation if password is valid or not
		System.out.println("Password is " + (checkPassword(n) ? "valid" : "invalid"));
	}
}
