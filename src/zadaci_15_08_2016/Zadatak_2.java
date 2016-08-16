
/******************************************************************************************************************
 * 
 * Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, 
 * da li je raèunar pobijedio ili je bilo neriješeno. 
 * 
 ******************************************************************************************************************/

package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		//Code that can throw an exception
		try {
			
			//Scanner object for user input
			Scanner input = new Scanner(System.in);
			
			//Prompts user to enter numbers from 0 - 2
			System.out.println("Enter number 0, 1 or 2(0 - Rock, 1 - Paper, 2 - Scissors):");

			
			int user = input.nextInt();			//User input
			
			wrongInput(user);							//Checks if user input is wrong
			
			int computer = (int) (Math.random() * 3);	//Generates random number from 0 - 2
			
			input.close();								//Scanner closed
			
		
			switch (computer) {		//Switch statement for random generated number
			case 0:						//if random number is 0 it checks who won the game
				if (user == 0) {
					System.out.println("You drew Rock, computer drew Rock. It's a draw!");
				} else if (user == 1) {
					System.out.println("You drew Paper, computer drew Rock. You Win!");
				} else if (user == 2) {
					System.out.println("You drew Scissors, computer drew Rock. You Lose!");
				}
				break;

			case 1:						//if random number is 1 it checks who won the game
				if (user == 0) {
					System.out.println("You drew Rock, computer drew Paper. You Lose!");
				} else if (user == 1) {
					System.out.println("You drew Paper, computer drew Paper. It's a draw!");
				} else if (user == 2) {
					System.out.println("You drew Scissors, computer drew Paper. You Win!");
				}
				break;
			case 2:						//if random number is 1 it checks who won the game
				if (user == 0) {
					System.out.println("You drew Rock, computer drew Scissors. You Win!");
				} else if (user == 1) {
					System.out.println("You drew Paper, computer drew Scissors. You Lose!");
				} else if (user == 2) {
					System.out.println("You drew Scissors, computer drew Scissors. It's a Draw!");
				}

			}
			//Prints the message if it cathces an axception
		} catch (Exception e) {
			System.out.println("Enter only integer numbers from 0 - 2.");
		}
	}
	//If user input is less than 0 and larger than 2 it throws an exception
	public static void wrongInput(int n){
		if(n < 0 || n > 2){
			throw new InputMismatchException();
		}
	}
}
