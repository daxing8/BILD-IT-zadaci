
/*Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. */

package zadaci_16_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);		//Scanner for user input

		System.out.println("Enter a string: ");					//Propts user to enter a string
		
		String str = input.nextLine();					//User input
		
		input.close();						//Scanner closed for user input
		
		//Prints lenght and first letter of a string
		System.out.println("Length of a string is: " + str.length() 
									+ "\nFirst letter of a string is: " + str.charAt(0));
	}
}
