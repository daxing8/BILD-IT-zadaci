package crapsAndCreditCard;

public class CrapsGame {

	public static void main(String[] args) {
		
		//Two variables store random numbers of the dice throw from 1 to 6
		int dice1 = (int) (1 + Math.random() * 6);
		int dice2 = (int) (1 + Math.random() * 6);
		
		//Adds two dice throws 
		int result = dice1 + dice2;
		
		//Prints which dices are rolled and their sum
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + result);
		
		//If dice throw is a natural number player wins
		if (isNatural(result)) {
			System.out.println("You win");				//Outputs a message that player wins
			
			//If dice throw is a craps number player loses
		} else if (isCraps(result)) {
			System.out.println("You lose");				//Player lost message output
			
			
		} else
			isPoint(result);	//If dice throw is another value (4, 5, 6, 8, 9, 10) that number becomes a point
	}
	
	//Method checks if a number is natural
	public static boolean isNatural(int n) {
		
		//Array of natural numbers
		int[] naturals = { 7, 11 };
		
		//If number is equal to one of naturals it returns true
		for (int i = 0; i < naturals.length; i++) {
			if (n == naturals[i]) {
				return true;
			}
		}
		//If the number is not natural it is false
		return false;
	}
	
	//Method checks if a number is craps number
	public static boolean isCraps(int n) {
		
		//Array of craps
		int[] craps = { 2, 3, 12 };
		
		//If one of the craps numbers is equal to argument number it returns true
		for (int i = 0; i < craps.length; i++) {
			if (n == craps[i]) {
				return true;		//number is craps
			}
		}
		return false;		//number is not craps
	}
	
	//Method sets a point number and rolls the dice again until it gets a winner
	public static void isPoint(int n) {
		
		//Array of point numbers
		int[] point = { 4, 5, 6, 8, 9, 10 };
		
		//Stores sum of two dices thrown
		int result = 0;
		
		//If number is same as one of the point numbers it sets it to point
		for (int i = 0; i < point.length; i++) {
			if (n == point[i]) {	
				System.out.println("Point is " + point[i]);	//Prints that number is a point	
				
				break;										//Exits the loop
			}
		}
		
		//Rolls the dice until it gets a point number or a 7
		do {
			//Dice roll again
			int diceOne = (int) (1 + Math.random() * 6);
			int diceTwo = (int) (1 + Math.random() * 6);
			
			result = diceOne + diceTwo;						//Sums the dice numbers
			
			//If the sum of dice throw is a point number the player wins
			if (result == n) {
				System.out.println("You rolled " + diceOne + " + " + diceTwo + " = " + n + "\nYou win");
				
				break;										//Exits the loop
				
				//If result of dice throw is a 7 the player loses
			} else if (result == 7) {
				System.out.println("You rolled " + diceOne + " + " + diceTwo + " = " + 7 + "\nYou lose");
				
				break;										//Exits the loop
			}
			
			//Condition for loop iteration
		} while (result != n || result != 7);
	}
}
